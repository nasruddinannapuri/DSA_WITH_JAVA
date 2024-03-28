package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the no of elements to enter");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            list.add(i,sc.nextInt());
        }
        System.out.println(list);
        Collections.sort(list); // ascending order
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        // Comparator - function which defines sorting logic in java
        System.out.println(list);


    }
}
