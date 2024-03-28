package ArrayList;
import java.util.ArrayList;
import java.util.*;
public class Classroom {
    // java collection frame work
    // c++ vectors = arraylist in java

    /*
     * Operations on arraylist:
     * 1) Add Element - O(1)
     * 2) get Element - O(1)
     * 3) Remove Element - O(n) - first search and remove the element.
     * 4) Set Element at Index - O(n)
     * 5) Contains Element - O(n) - check if element is present or not 
     *      if present then print true otherwise false;
     * 
     */
    
    public static void main(String[] args) {
        // classname objname = new classname();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); // O(1)
        list.add(2);
        System.out.println(list);

        // Get operation
        int x = list.get(0);
        System.out.println(x);

        // Delete 
        list.remove(1);
        System.out.println(list);

        list.add(3);
        list.add(2);

        // set operation
        list.set(2,10);
        System.out.println(list);
        
        // Contains
        System.err.println(list.contains(10));
        System.out.println(list.contains(15));

        list.add(1,9); // O(n)
        /*
         * here for normal adding we will get O(1) but
         * here we are getting O(n) just because we are adding
         * elemrnt at certainn position and then remaining elements
         * after and at that position will shift right.
         */
        System.out.println(list);


        // size just like length in arrays
        System.out.println(list.size());

        // print the arraylist
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

    

        
    }
}
