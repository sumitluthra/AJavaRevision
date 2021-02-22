package com.collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<>(12);
/*		q.offer(1);
		q.add(2);
*/		
		for (int i = 0; i < 15; i++) {
			q.add(i);
		}
		
		System.out.println(q);
	}
}
