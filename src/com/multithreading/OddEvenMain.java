package com.multithreading;

public class OddEvenMain {

	public static void main(String[] args) {
		
		OddEvenPrint print = new OddEvenPrint();
		
		Runnable r = () -> {print.printEven();};
		new Thread(r).start();
		
		new Thread(()-> {print.printOdd();}).start();
		
		
	}
}
