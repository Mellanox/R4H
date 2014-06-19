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
import java.nio.ByteBuffer;

/**
 * A weak implementation of OutputStream to a ByteBuffer. "weak" because it can only write to the byteBuffer byte after
 * byte instead of using ByteBuffer API to write several bytes at once for primitives types
 */
public class ByteBufferOutputStream extends OutputStream {

	ByteBuffer buff;

	public ByteBufferOutputStream(ByteBuffer buf) {
		this.buff = buf;
	}

	@Override
	public void write(int b) throws IOException {
		buff.put((byte) b);
	}

	@Override
	public void write(byte[] bytes, int off, int len) throws IOException {
		buff.put(bytes, off, len);
	}

}
