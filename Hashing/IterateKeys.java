package Hashing;
import java.util.*;

public class IterateKeys {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        // Iterate: 
        // hm.keySet() - 
        // hm.entrySet() - it will get pair sets; another method
        Set<String> keys = hm.keySet();
        System.out.println(keys);
 

        for (String k : keys) {
            System.err.println("key= "+k+ ",value= "+hm.get(k));
        }
    
    }
    
}
