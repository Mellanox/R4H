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
import java.io.InputStream;
import java.nio.ByteBuffer;

/**
 * A weak implementation of InputStream to a ByteBuffer. "weak" because it can only read the byteBuffer byte after byte
 * instead of using ByteBuffer API to read several bytes at once for primitives types
 */
public class ByteBufferInputStream extends InputStream {
	private final ByteBuffer buff;

	public ByteBufferInputStream(ByteBuffer buff) {
		this.buff = buff;

	}

	@Override
	public int read() throws IOException {
		if (!buff.hasRemaining()) {
			return -1;
		}

		// return buff.get(); // BAD! XXX - must be value=0-255 and casting breaks it
		return buff.get() & 0xFF;
	}

	@Override
	public int read(byte[] bytes, int off, int len) throws IOException {
		if (!buff.hasRemaining()) {
			return -1;
		}

		len = Math.min(len, buff.remaining());
		buff.get(bytes, off, len);
		return len;
	}

}
