package _10_Collectionframework;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class _5_LinkedHashset {

     public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add(null); // One null allowed

        // Attempt to add duplicate
        fruits.add("Apple"); // Duplicate will not be added

        // Check elements
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Size and emptiness
        System.out.println("Size: " + fruits.size());
        System.out.println("Is empty? " + fruits.isEmpty());

        // Iteration preserving insertion order
        System.out.println("Fruits in insertion order:");
        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove element
        fruits.remove("Banana");

        // Convert to array
        String[] fruitArray = new String[fruits.size()];
        fruitArray = fruits.toArray(fruitArray);
        System.out.println("Array of fruits:");
        for(String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // Clear all elements
        fruits.clear();
        System.out.println("After clear, is empty? " + fruits.isEmpty());
    }
}
