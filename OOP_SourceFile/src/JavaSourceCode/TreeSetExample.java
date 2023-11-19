package JavaSourceCode;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Creating a TreeSet
        Set<String> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

        // Adding a duplicate element (ignored, as Sets only store unique elements)
        treeSet.add("Banana");

        // Accessing elements (TreeSet is sorted)
        System.out.println("TreeSet: " + treeSet);  // Output: TreeSet: [Apple, Banana, Cherry]

        // Checking if an element is present
        boolean containsBanana = treeSet.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);  // Output: Contains 'Banana': true

        // Removing an element
        treeSet.remove("Cherry");
        System.out.println("TreeSet after removing 'Cherry': " + treeSet);  // Output: TreeSet after removing 'Cherry': [Apple, Banana]
    }
}
