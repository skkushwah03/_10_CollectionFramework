package _10_Collectionframework;

import java.util.PriorityQueue;
import java.util.Iterator;

public class _7_PriorityQueue {
    public static void main(String[] args) {
        // Create a PriorityQueue with natural ordering (min heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.offer(5);

        // Access elements
        System.out.println("Head element (peek): " + pq.peek());
        System.out.println("Head element (element): " + pq.element());

        // Iterate (order not guaranteed)
        System.out.println("Iterating over elements:");
        for(Integer val : pq) {
            System.out.println(val);
        }

        // Remove elements
        System.out.println("Removing head (poll): " + pq.poll());
        System.out.println("Removing head (remove): " + pq.remove());

        // Check size and state
        System.out.println("Size after removals: " + pq.size());
        System.out.println("Is empty? " + pq.isEmpty());

        // Add more elements
        pq.add(40);
        pq.add(15);

        // Convert to array
        Object[] array = pq.toArray();
        System.out.println("Array contents:");
        for(Object val : array) {
            System.out.println(val);
        }

        // Using custom comparator (max heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(5);

        System.out.println("Max heap head: " + maxHeap.peek());
    }
}
