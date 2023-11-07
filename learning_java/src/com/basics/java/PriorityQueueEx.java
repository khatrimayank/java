package com.basics.java;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<String> al1=new ArrayList<>();
		al1.add("apple");
		al1.add("banana");
		
		al.addAll(al1);
		
		
		// Create a priority queue with initial capacity 10
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// Add elements to the queue
		pq.add(8);
		pq.add(1);
		pq.add(2);
		pq.add(5);
		pq.add(4);
		
		// Print the queue
		System.out.println("Priority queue: " + pq);
		
		// Peek at the top element of the queue
		System.out.println("Peek: " + pq.peek());
		
		// Remove the top element of the queue
		pq.poll();
		
		// Print the queue again
		System.out.println("Priority queue after removing top element: " + pq);
		
		// Check if the queue contains a specific element
		System.out.println("Does the queue contain 3? " + pq.contains(3));
		
		// Get the size of the queue
		System.out.println("Size of queue: " + pq.size());
		
		// Remove all elements from the queue
		pq.clear();
		
		// Check if the queue is empty
		System.out.println("Is the queue empty? " + pq.isEmpty());
	}
}
