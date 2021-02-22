package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ArrayListWithThreadCallable implements Callable<Integer> {

	private List<Integer> list = new ArrayList<Integer>();

	@Override
	public Integer call() {

		synchronized (this) {

			for (int i = 0; i < 50; i++) {
				list.add(i);
				System.out.println("Thread name: " + Thread.currentThread().getName() + " - i value - " + i);
			}
			return list.size();
		}
	}

	public static void main(String[] args) {

		ArrayListWithThreadCallable a = new ArrayListWithThreadCallable();
		ExecutorService newSingleThreadExecutor = Executors.newFixedThreadPool(3);
		// ExecutorService newSingleThreadExecutor =
		// Executors.newSingleThreadExecutor();
		List<Callable<Integer>> callables = new ArrayList<>();
		callables.add(a);
		callables.add(a);
		callables.add(a);

		try {
			List<Future<Integer>> invokeAll = newSingleThreadExecutor.invokeAll(callables);
			// Integer invokeAny = newSingleThreadExecutor.invokeAny(callables);
			for (Future<Integer> future : invokeAll) {
				System.out.println(future.get());
			}
			System.out.println("invole any " + invokeAll);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * Future<Integer> submit = newSingleThreadExecutor.submit(a);
		 * 
		 * try { Integer integer = submit.get();
		 * System.out.println("integer freturned from callable ::"+integer); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (ExecutionException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 * 
		 * 
		 * System.out.println(a.list.size()); System.out.println(a.list);
		 */

		newSingleThreadExecutor.shutdown();
	}
}
