package JavaSourceCode;

import java.util.Vector;
import java.util.Enumeration;

public class VectorExample {

    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Displaying the Vector
        System.out.println("Vector: " + vector);  // Output: [Apple, Banana, Cherry]

        // Accessing elements
        String firstElement = vector.firstElement();
        String lastElement = vector.lastElement();
        System.out.println("First Element: " + firstElement);  // Output: Apple
        System.out.println("Last Element: " + lastElement);    // Output: Cherry

        // Getting and setting elements by index
        String elementAtIndex = vector.get(1);
        System.out.println("Element at index 1: " + elementAtIndex);  // Output: Banana
        vector.set(1, "Grapes");
        System.out.println("Updated element at index 1: " + vector.get(1));  // Output: Grapes

        // Removing elements
        vector.remove(0);
        System.out.println("After removing element at index 0: " + vector);  // Output: [Grapes, Cherry]

        // Checking if an element is present
        boolean containsBanana = vector.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);  // Output: false

        // Finding the index of an element
        int indexOfCherry = vector.indexOf("Cherry");
        System.out.println("Index of 'Cherry': " + indexOfCherry);  // Output: 1

        // Enumeration - Legacy way to iterate through elements
        Enumeration<String> enumeration = vector.elements();
        System.out.println("Using Enumeration:");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");  // Output: Grapes Cherry
        }
        System.out.println();

        // Size and capacity
        int size = vector.size();
        int capacity = vector.capacity();
        System.out.println("Size: " + size);        // Output: 2
        System.out.println("Capacity: " + capacity);  // Output: 10 (initial capacity)

        // Clearing the Vector
        vector.clear();
        System.out.println("After clearing the Vector: " + vector);  // Output: []
    }
}
