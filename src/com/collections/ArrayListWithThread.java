package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ArrayListWithThread implements Runnable {

	private List<Integer> list = new ArrayList<Integer>();

	@Override
	public void run(){

		synchronized (this) {

			for (int i = 0; i < 50; i++) {
				list.add(i);
//				if(i==10)
//					throw new Exception();
				System.out.println("Thread name: " + Thread.currentThread().getName() + " - i value - " + i);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		ArrayListWithThread a = new ArrayListWithThread();
	//	new Thread(a, "one").start();
		new Thread(a, "two").start();

		Executor executor =  Executors.newSingleThreadExecutor();
		executor.execute(a);	

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(a.list.size());
		System.out.println(a.list);
		
	}
}
