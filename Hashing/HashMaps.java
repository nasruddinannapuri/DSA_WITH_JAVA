package Hashing;
import java.util.*;

public class HashMaps {


    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert - O(1)
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("UK", 300);
        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonasia")); // null

        // ContainsKey - O(1)
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Indonasia")); // false

        // Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // Size
        System.out.println("Size: "+hm.size()); // 3

        // Is Empty
        System.out.println(hm.isEmpty()); // false

        



    }
    
}
