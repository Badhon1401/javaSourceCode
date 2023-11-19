package JavaSourceCode;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("Apple", 3);
        hashMap.put("Banana", 5);
        hashMap.put("Cherry", 2);

        // Accessing elements
        int bananaCount = hashMap.get("Banana");
        System.out.println("Number of Bananas: " + bananaCount);  // Output: Number of Bananas: 5

        // Checking if a key is present
        boolean containsKey = hashMap.containsKey("Orange");
        System.out.println("Contains key 'Orange': " + containsKey);  // Output: Contains key 'Orange': false

        // Iterating through key-value pairs
        System.out.println("Iterating through key-value pairs:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Output:
        // Apple: 3
        // Banana: 5
        // Cherry: 2
    }
}
