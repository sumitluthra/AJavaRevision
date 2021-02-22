package com.multithreading;

import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n, sum=0;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Sum of first n numbers");
		Scanner scanner = new Scanner(System.in);
		
		JoinDemo.n = scanner.nextInt();
		JoinDemo joinDemo = new JoinDemo();
		joinDemo.start();
		joinDemo.join();
		
		System.out.println("Sum of numbers is"+JoinDemo.sum);
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
		}
	}
}
