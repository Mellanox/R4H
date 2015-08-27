package com.mellanox.r4h;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

public class IOBufferSupplier {
	private final ConcurrentLinkedQueue<ByteBuffer> ioBufferPool = new ConcurrentLinkedQueue<ByteBuffer>();

	public IOBufferSupplier(int numOfBuffers, int bufferSize) {
		allocateBuffers(numOfBuffers, bufferSize);
	}

	public ByteBuffer getBuffer() throws IOException {
		ByteBuffer buff = ioBufferPool.poll();
		if (buff == null) {
			throw new IOException("No more buffers for async IO");
		}
		buff.clear();
		return buff;
	}

	public void returnBuffer(ByteBuffer buff) {
		if (buff != null) {
			buff.clear();
			ioBufferPool.add(buff);
		}
	}

	public int size() {
		return ioBufferPool.size();
	}

	public void allocateBuffers(int numOfBuffers, int bufferSize) {
		ByteBuffer buffer = ByteBuffer.allocate(bufferSize * numOfBuffers);
		int position = 0;
		for (int j = 0; j < numOfBuffers; j++) {
			buffer.position(position);
			buffer.limit(position + bufferSize);
			ioBufferPool.add(buffer.slice());
			position += bufferSize;
		}
	}
}
