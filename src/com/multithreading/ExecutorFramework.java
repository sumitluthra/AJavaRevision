package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFramework {

	public static void main(String[] args) {

		/**
		 * Creates an Executor that uses a single worker thread operatingoff an
		 * unbounded queue. (Note however that if this singlethread terminates due to a
		 * failure during execution prior toshutdown, a new one will take its place if
		 * needed to executesubsequent tasks.) Tasks are guaranteed to
		 * executesequentially, and no more than one task will be active at anygiven
		 * time. Unlike the otherwise equivalent newFixedThreadPool(1) the returned
		 * executor isguaranteed not to be reconfigurable to use additional threads.
		 */
		Executors.newSingleThreadExecutor();
		Executors.newCachedThreadPool();

		
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		int count = 10;
		
		for (int i = 0; i < 30; i++) {
			executorService.execute(() -> {
				
				if (count == 10) {
					throw new IllegalStateException("handler exception");
				}
				System.out.println(Thread.currentThread() + " - testAsyncRunner1 run ... " + count);
			});
		}

	}
}
