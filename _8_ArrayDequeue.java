package _10_Collectionframework;

import java.util.ArrayDeque;

public class _8_ArrayDequeue {
     public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Add elements at tail
        deque.add("Apple");
        deque.offer("Banana");

        // Add elements at head
        deque.addFirst("Mango");
        deque.offerFirst("Orange");

        // Add elements at last
        deque.addLast("Grapes");
        deque.offerLast("Peach");

        // Access elements without removing
        System.out.println("First: " + deque.getFirst());
        System.out.println("Last: " + deque.getLast());

        // Remove elements
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());

        // Stack operations
        deque.push("Strawberry");
        System.out.println("Popped from stack: " + deque.pop());

        // Iterating over elements
        System.out.println("Iterating over deque:");
        for(String fruit : deque) {
            System.out.println(fruit);
        }

        // Convert to array
        Object[] array = deque.toArray();
        System.out.println("Array contents:");
        for(Object item : array) {
            System.out.println(item);
        }

        // Check size and emptiness
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());
    }
}
/*
 | Feature            | **PriorityQueue**                                                         | **ArrayDeque**                                             |
| ------------------ | ------------------------------------------------------------------------- | ---------------------------------------------------------- |
| **Purpose**        | Used for storing elements based on priority                               | Used as a double-ended queue or stack                      |
| **Ordering**       | Elements are ordered according to priority (natural or custom comparator) | Elements are ordered by insertion order; no sorting        |
| **Implementation** | Heap-based (usually binary heap)                                          | Resizable array-based structure                            |
| **Null Elements**  | **Not allowed**                                                           | **Not allowed**                                            |
| **Duplicates**     | Allowed                                                                   | Allowed                                                    |
| **Access Type**    | Access head element based on priority                                     | Access elements from both ends (head/tail)                 |
| **Use Case**       | Task scheduling, algorithms like Dijkstra’s, Huffman coding               | Stack operations, BFS traversal, undo-redo, regular queues |
| **Performance**    | O(log n) for add/remove operations, O(1) for peek                         | O(1) for add/remove at both ends, fast iteration           |
| **Thread Safety**  | Not synchronized (external handling required)                             | Not synchronized (external handling required)              |
| **Iterator Order** | Unpredictable, priority-based order must be polled                        | Predictable insertion order                                |

 */
