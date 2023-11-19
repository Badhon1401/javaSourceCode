package JavaSourceCode;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Accessing elements
        System.out.println("LinkedList: " + linkedList);  // Output: LinkedList: [Apple, Banana, Cherry]

        // Adding an element at the beginning
        linkedList.addFirst("Grapes");
        System.out.println("LinkedList after adding 'Grapes' at the beginning: " + linkedList);
        // Output: LinkedList after adding 'Grapes' at the beginning: [Grapes, Apple, Banana, Cherry]

        // Removing the last element
        linkedList.removeLast();
        System.out.println("LinkedList after removing the last element: " + linkedList);
        // Output: LinkedList after removing the last element: [Grapes, Apple, Banana]

        // Iterating through elements
        System.out.println("Iterating through elements:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
        // Output:
        // Grapes
        // Apple
        // Banana
    }
}
