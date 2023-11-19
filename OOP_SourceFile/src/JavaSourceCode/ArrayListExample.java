package JavaSourceCode;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Accessing elements
        System.out.println("ArrayList: " + arrayList);  // Output: ArrayList: [Apple, Banana, Cherry]

        // Adding an element at a specific index
        arrayList.add(1, "Grapes");
        System.out.println("ArrayList after adding 'Grapes' at index 1: " + arrayList);
        // Output: ArrayList after adding 'Grapes' at index 1: [Apple, Grapes, Banana, Cherry]

        // Removing an element by value
        arrayList.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + arrayList);
        // Output: ArrayList after removing 'Banana': [Apple, Grapes, Cherry]

        // Iterating through elements
        System.out.println("Iterating through elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        // Output:
        // Apple
        // Grapes
        // Cherry
    }
}
