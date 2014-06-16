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

import java.io.DataOutputStream;
import java.io.IOException;

/*
 * This class intended for letting R4H use Vanilla's original BlockReceiver.receivePacket()
 * Since we would like to separate networkIO from diskIO+CRCVerify for using multiIO thread pool and the original receivePacket() sends packet to mirror pipeline we need to sends the packet to mirror separatly and let receviePacket() do the diskIO+CRCverify only
 * An instance from this class will be provided to original receivePacket to avoid it's internal implementation of sending packets
 */
public class DummyDataOutputStream extends DataOutputStream {
	public DummyDataOutputStream() {
		super(null);
	}

	@Override
	public void write(byte[] b) throws IOException {
	}

	@Override
	public synchronized void write(int b) throws IOException {
	}

	@Override
	public void flush() throws IOException {
	}
}