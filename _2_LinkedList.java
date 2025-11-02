package _10_Collectionframework;
import java.util.LinkedList;
import java.util.Collections;
public class _2_LinkedListt {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        //add
        l1.add(1);
        l1.addLast(2);
        l1.addFirst(0);
        //
        System.out.println(l1);
        //remove
        l1.removeLast();
        l1.removeFirst();
        System.out.println(l1);

        /*
        LinkedList<String> list = new LinkedList<>();        // Empty list
        LinkedList<String> list2 = new LinkedList<>(existingCollection); // Create from another collection
        list.add("A");               // Add at the end
        list.add(1, "B");            // Insert at index 1
        list.addFirst("Start");      // Add at beginning
        list.addLast("End");         // Add at end
        list.offer("Offer");         // Adds at end (Queue method)
        list.offerFirst("OfferStart"); // Adds at beginning
        list.offerLast("OfferEnd");  // Adds at end

        String first = list.getFirst(); // Get first element
        String last = list.getLast();   // Get last element
        String atIndex = list.get(2);   // Get element at index 2

        list.set(1, "NewValue");      // Replace element at index 1

        list.remove();                // Removes first element
        list.remove(2);               // Removes element at index 2
        list.remove("A");             // Removes first occurrence of "A"
        list.removeFirst();          // Removes first element
        list.removeLast();           // Removes last element
        list.poll();                 // Retrieves and removes first element
        list.pollFirst();            // Retrieves and removes first element
        list.pollLast();             // Retrieves and removes last element
        list.clear();                // Removes all elements


        boolean contains = list.contains("A"); // Check if element exists
        int index = list.indexOf("A");         // Find index of first occurrence
        int lastIndex = list.lastIndexOf("A"); // Find index of last occurrence
        boolean empty = list.isEmpty();        // Check if empty

        int size = list.size();      // Returns number of elements

        for(int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
        }

        for(String element : list) {
         System.out.println(element);
         }

         Iterator<String> it = list.iterator();
        while(it.hasNext()) {
        System.out.println(it.next());
        }

        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()) {
        System.out.println(lit.next());
        }

        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()) {
        System.out.println(lit.next());
        }

        list.push("X");    // Adds element at front
        String popped = list.pop(); // Removes and returns first element

        Object[] arr = list.toArray();
        String[] strArr = new String[list.size()];
        strArr = list.toArray(strArr);

        Collections.sort(list); // Sorts elements in natural order
        Collections.reverse(list); // Reverses the list
        
         */
    }
}
