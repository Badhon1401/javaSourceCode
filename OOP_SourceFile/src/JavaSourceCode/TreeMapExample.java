package JavaSourceCode;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs
        treeMap.put("Apple", 3);
        treeMap.put("Banana", 5);
        treeMap.put("Cherry", 2);

        // Accessing elements
        int bananaCount = treeMap.get("Banana");
        System.out.println("Number of Bananas: " + bananaCount);  // Output: Number of Bananas: 5

        // Checking if a key is present
        boolean containsKey = treeMap.containsKey("Orange");
        System.out.println("Contains key 'Orange': " + containsKey);  // Output: Contains key 'Orange': false

        // Iterating through key-value pairs (TreeMap is sorted by keys)
        System.out.println("Iterating through key-value pairs:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Output:
        // Apple: 3
        // Banana: 5
        // Cherry: 2
    }
}
