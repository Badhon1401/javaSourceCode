package JavaSourceCode;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Adding a duplicate element (ignored, as Sets only store unique elements)
        hashSet.add("Banana");

        // Accessing elements
        System.out.println("HashSet: " + hashSet);  // Output: HashSet: [Apple, Banana, Cherry]

        // Checking if an element is present
        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);  // Output: Contains 'Banana': true

        // Removing an element
        hashSet.remove("Cherry");
        System.out.println("HashSet after removing 'Cherry': " + hashSet);  // Output: HashSet after removing 'Cherry': [Apple, Banana]
    }
}
