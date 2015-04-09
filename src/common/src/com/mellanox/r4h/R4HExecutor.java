package com.mellanox.r4h;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.accelio.jxio.Msg;

public class R4HExecutor {

	private ExecutorService executor;

	R4HExecutor(ThreadFactory threadFactory) {
		this.executor = Executors.newSingleThreadExecutor(threadFactory);
	}

	public void execute(final Msg msg, final MessageAction action, final Runnable task) {

		final PacketMessageContext pmc = PacketMessageContext.getPacketMessageContext(msg);

		// increment counter
		pmc.incrementReferenceCounter();

		// execute
		this.executor.execute(new Runnable() {

			@Override
			public void run() {
				task.run();

				// decrement and send
				int refCount = pmc.decrementReferenceCounter();

				if (refCount == 0) {

					action.onPacketComplete(msg);
				}
			}
		});
	}

	public void execute(Runnable task) {
		this.executor.execute(task);
	}

	public List<Runnable> shutdownNow() {
		return this.executor.shutdownNow();
	}

}