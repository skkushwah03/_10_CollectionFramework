package _10_Collectionframework;

import java.util.TreeSet;
import java.util.Iterator;

public class _6_TreeHashset {
     public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Check elements
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // First and last elements
        System.out.println("First element: " + fruits.first());
        System.out.println("Last element: " + fruits.last());

        // Higher, lower, ceiling, floor
        System.out.println("Higher than Banana: " + fruits.higher("Banana"));
        System.out.println("Lower than Banana: " + fruits.lower("Banana"));
        System.out.println("Ceiling of Banana: " + fruits.ceiling("Banana"));
        System.out.println("Floor of Banana: " + fruits.floor("Banana"));

        // Subsets
        System.out.println("HeadSet before Mango: " + fruits.headSet("Mango"));
        System.out.println("TailSet from Mango: " + fruits.tailSet("Mango"));
        System.out.println("SubSet from Banana to Orange: " + fruits.subSet("Banana", "Orange"));

        // Iteration
        System.out.println("All fruits in sorted order:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // Descending order
        System.out.println("Fruits in descending order:");
        Iterator<String> descending = fruits.descendingIterator();
        while(descending.hasNext()) {
            System.out.println(descending.next());
        }

        // Convert to array
        String[] arr = new String[fruits.size()];
        arr = fruits.toArray(arr);
        System.out.println("Array of fruits:");
        for(String fruit : arr) {
            System.out.println(fruit);
        }
    }
}
/*
 | Feature             | **HashSet**                                       | **LinkedHashSet**                       | **TreeSet**                                              |
| ------------------- | ------------------------------------------------- | --------------------------------------- | -------------------------------------------------------- |
| **Order**           | No guaranteed order                               | Maintains insertion order               | Sorted order (natural or comparator)                     |
| **Duplicates**      | Not allowed                                       | Not allowed                             | Not allowed                                              |
| **Null Elements**   | Allows one null element                           | Allows one null element                 | Does **not** allow null elements                         |
| **Implementation**  | Hash table                                        | Hash table with linked list             | Red-Black tree                                           |
| **Access Time**     | O(1) (constant time, on average)                  | O(1), with slight overhead for ordering | O(log n) (tree-based search)                             |
| **Use Case**        | Fast access, no order                             | Fast access, insertion order preserved  | Sorted data, range queries, or ordering needed           |
| **Iteration Order** | Unpredictable                                     | Predictable (insertion order)           | Sorted (natural or custom)                               |
| **Thread Safety**   | Not synchronized                                  | Not synchronized                        | Not synchronized                                         |
| **When to Use**     | When order doesn't matter, and performance is key | When order of insertion matters         | When sorted order or range-based operations are required |

 */
