/*
 ** Copyright (C) 2014 Mellanox Technologies
 **
 ** Licensed under the Apache License, Version 2.0 (the "License");
 ** you may not use this file except in compliance with the License.
 ** You may obtain a copy of the License at:
 **
 ** http://www.apache.org/licenses/LICENSE-2.0
 **
 ** Unless required by applicable law or agreed to in writing, software
 ** distributed under the License is distributed on an "AS IS" BASIS,
 ** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 ** either express or implied. See the License for the specific language
 ** governing permissions and  limitations under the License.
 **
 */

package com.mellanox.r4h;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.apache.hadoop.util.StringUtils;

public class AsyncFileOutputStream extends FileOutputStream {
	private final ExecutorService threadPool;
	private final AsyncWriteCompletion writeCompleteCallBack;
	private Object userContext = null;
	private long limiterThreadID = 0;

	public AsyncFileOutputStream(File file, ExecutorService threadPool, AsyncWriteCompletion writeCompleteCallBack) throws FileNotFoundException {
		super(file);
		this.threadPool = threadPool;
		this.writeCompleteCallBack = writeCompleteCallBack;
	}

	public AsyncFileOutputStream(FileDescriptor fd, ExecutorService threadPool, AsyncWriteCompletion writeCompleteCallBack)
	        throws FileNotFoundException {
		super(fd);
		this.threadPool = threadPool;
		this.writeCompleteCallBack = writeCompleteCallBack;
	}

	public void setUserContext(Object userContext) {
		this.userContext = userContext;
	}

	public void limitAsyncIObyThreadID(long limiterThreadId) {
		this.limiterThreadID = limiterThreadId;
	}

	public class AsyncWrite implements Runnable {
		private final byte[] b;
		private final int off;
		private final int len;
		private final Object context;

		public AsyncWrite(Object context, byte[] b, int off, int len) {
			this.context = context;
			this.b = b;
			this.off = off;
			this.len = len;
		}

		@Override
		public void run() {

			try {
				AsyncFileOutputStream.super.write(b, off, len);
			} catch (IOException e) {
				onWriteComplete(this, e);
			} catch (Throwable t) {
				onWriteComplete(this, new IOException(t));
			}
			onWriteComplete(this);
		}

		@Override
		public String toString() {
			return String.format("AsyncWrite{ context='%s', offset='%d',  length='%d' }", context, off, len);
		}

	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		if ((limiterThreadID == 0) || (limiterThreadID == Thread.currentThread().getId())) {
			threadPool.execute(new AsyncWrite(this.userContext, b, off, len));
//			try {
//	            threadPool.submit(new AsyncWrite(this.userContext, b, off, len)).get();
//            } catch (InterruptedException | ExecutionException e) {
//	            DataXceiverServer.LOG.error(StringUtils.stringifyException(e));
//            }
			
		} else {
			super.write(b, off, len);
		}
	}

	@Override
	public void write(byte[] b) throws IOException {
		if ((limiterThreadID == 0) || (limiterThreadID == Thread.currentThread().getId())) {
			threadPool.execute(new AsyncWrite(this, b, 0, b.length));
//			try {
//	            threadPool.submit(new AsyncWrite(this, b, 0, b.length)).get();
//            } catch (InterruptedException | ExecutionException e) {
//	            DataXceiverServer.LOG.error(StringUtils.stringifyException(e));
//            }
		} else {
			super.write(b, 0, b.length);
		}
	}

	private void onWriteComplete(AsyncWrite asyncWrite) {
		onWriteComplete(asyncWrite, null);
	}

	private void onWriteComplete(AsyncWrite asyncWrite, IOException e) {
		if (writeCompleteCallBack != null)
			writeCompleteCallBack.onWriteComplete(asyncWrite, e);
	}

	public static interface AsyncWriteCompletion {
		void onWriteComplete(Object context, IOException e);
	}

}
