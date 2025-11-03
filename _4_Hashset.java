package _10_Collectionframework;
import java.util.HashSet;
import java.util.Iterator;

public class _4_Hashset {
     public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add(null); // Allowed once

        // Removing an element
        fruits.remove("Orange");

        // Checking if element exists
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Size and emptiness
        System.out.println("Size: " + fruits.size());
        System.out.println("Is empty? " + fruits.isEmpty());

        // Iterating
        System.out.println("Elements using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Elements using iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Converting to array
        Object[] arr = fruits.toArray();
        System.out.println("Array elements:");
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // Set operations
        HashSet<String> tropical = new HashSet<>();
        tropical.add("Mango");
        tropical.add("Pineapple");

        // Union
        fruits.addAll(tropical);
        System.out.println("After union: " + fruits);

        // Intersection
        fruits.retainAll(tropical);
        System.out.println("After intersection: " + fruits);

        // Difference
        fruits.removeAll(tropical);
        System.out.println("After difference: " + fruits);

        // Clear
        fruits.clear();
        System.out.println("After clear, is empty? " + fruits.isEmpty());
    }
}
