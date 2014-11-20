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

import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.logging.LogFactory;

import org.accelio.jxio.ClientSession;
import org.accelio.jxio.Msg;
import org.accelio.jxio.MsgPool;

/**
 * @todo
 *       Implement close(). Is used in DFSClient.
 * @todo
 *       Return messages to pool.
 */
public class JXOutputStream extends OutputStream {
	Msg msg = null;
	private boolean flushed = true;
	private final MsgPool msgPool;
	private final ClientSession cs;

	/**
	 * TODO:UPDATE!! Creates a new JXIO output stream to write data and send requests to an underlying Client Session.
	 * 
	 * @param pool
	 *            An underlying MsgPool to retrieve Msgs to write the data
	 * @param cs
	 *            An underlying ClinetSession to send requests when current Msg is full or flushed
	 */
	public JXOutputStream(MsgPool pool, ClientSession cs) {
		this.msgPool = pool;
		this.cs = cs;
	}

	/**
	 * TODO:UPDATE!! Writes the specified byte to the current underlying Msg's out buffer.
	 * 
	 * @param b
	 *            the byte to be written.
	 * @exception IOException
	 *                if an I/O error occurs.
	 */
	public synchronized void write(int b) throws IOException {
		if (this.msg == null) {
			this.msg = msgPool.getMsg();
		}
		if (!msg.getOut().hasRemaining()) {
			throw new IOException("MSG's out buffer is full");
		}
		msg.getOut().put((byte) b);
		flushed = false;
	}

	/**
	 * TODO:UPDATE!! Writes <code>len</code> bytes from the specified byte array starting at offset <code>off</code> to
	 * this buffered output stream.
	 * <p>
	 * Ordinarily this method stores bytes from the given array into the current underlying Msg's out buffer, flushing the buffer to the underlying
	 * output by sending a request with the ClientSeesion as needed. If the requested length is at least as large as this stream's buffer, however,
	 * then this method will flush by sending a request with the ClientSeesion and current Msg. No data will be copied.
	 * 
	 * @param b
	 *            the data.
	 * @param off
	 *            the start offset in the data.
	 * @param len
	 *            the number of bytes to write.
	 * @exception IOException
	 *                if an I/O error occurs.
	 */
	public synchronized void write(byte b[], int off, int len) throws IOException {
		if (this.msg == null) {
			this.msg = msgPool.getMsg();
		}
		if (len > msg.getOut().remaining()) {
			throw new IOException("No enough space remained on MSG's out buffer");
			// TODO: format msg with numbers
		}

		msg.getOut().put(b, off, len);
		flushed = false;
	}

	/**
	 * TODO:UPDATE!! Flushes this buffered output stream. This forces any buffered output bytes to be written out to the
	 * underlying output stream.
	 * 
	 * @exception IOException
	 *                if an I/O error occurs.
	 * @see java.io.FilterOutputStream#out
	 */
	public synchronized void flush() throws IOException {
		if (!flushed) {
			R4HProtocol.wrappedSendRequest(cs, msg, LogFactory.getLog(JXOutputStream.class));
			msg = null;
			flushed = true;
		}
	}

	/**
	 * Close the stream.
	 * Actually it closes the client session.
	 */
	public synchronized void close() {
		cs.close();
	}

}
