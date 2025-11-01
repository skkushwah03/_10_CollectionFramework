package _10_Collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class _1_ArrayListt{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(1, "Mango");

        // Get and set
        System.out.println("Element at index 2: " + fruits.get(2));
        fruits.set(2, "Pineapple");
    

        // Check and remove
        System.out.println("Contains Banana? " + fruits.contains("Banana"));
        fruits.remove("Banana");

        // Size
        System.out.println("Size: " + fruits.size());

        // Iterate
        System.out.println("Fruits list:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // Sort
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // Convert to array
        String[] fruitArray = new String[fruits.size()];
        fruitArray = fruits.toArray(fruitArray);

        System.out.println("Array:");
        for(String f : fruitArray){
            System.out.println(f);
        }
    }
}
