package com.multithreading;

public class Even implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 11; i++) {
			synchronized (this) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}

	}

}
