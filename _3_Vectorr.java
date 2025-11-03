package _10_Collectionframework;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;
public class _3_Vectorr {
     public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Add elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(1, 15);  // Insert at index 1
        vector.addElement(40); // Legacy method

        // Access elements
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        System.out.println("Element at index 2: " + vector.get(2));

        // Modify element
        vector.set(2, 35);
        System.out.println("After set: " + vector.get(2));

        // Check contains
        System.out.println("Contains 20? " + vector.contains(20));

        // Remove elements
        vector.remove(Integer.valueOf(20));
        vector.removeElement(40);

        // Size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Iterate using enhanced for loop
        System.out.println("Elements:");
        for (Integer val : vector) {
            System.out.println(val);
        }

        // Sort
        Collections.sort(vector);
        System.out.println("Sorted: " + vector);

        // Convert to array
        Integer[] arr = new Integer[vector.size()];
        arr = vector.toArray(arr);
        System.out.println("Array:");
        for (Integer val : arr) {
            System.out.println(val);
        }
    }
}
/*
  | Feature                | **ArrayList**                      | **LinkedList**                     | **Vector**                            |
| ---------------------- | ---------------------------------- | ---------------------------------- | ------------------------------------- |
| **Data Structure**     | Resizable array                    | Doubly-linked list                 | Resizable array                       |
| **Synchronization**    | Not synchronized (not thread-safe) | Not synchronized (not thread-safe) | Synchronized (thread-safe)            |
| **Access Time**        | Fast random access (O(1))          | Slow random access (O(n))          | Fast random access (O(1))             |
| **Insertion/Deletion** | Slower if not at the end           | Faster, especially at start/middle | Similar to ArrayList but synchronized |
| **Memory Overhead**    | Less overhead                      | More overhead (extra pointers)     | Less overhead but extra for sync      |
| **Growth Policy**      | Increases by 50% of current size   | No such concept, node-based        | Increases by doubling the size        |
| **Iterator Type**      | Fail-fast                          | Fail-fast                          | Fail-fast                             |
| **Legacy**             | Introduced in Java 1.2             | Introduced in Java 1.2             | Legacy class from Java 1.0            |
| **Use Cases**          | When frequent access is needed     | When frequent insertions/deletions | When thread safety is required        |

 */
