package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumNo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the no of elements to enter");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            list.add(i,sc.nextInt());
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            // here time complexity was O(n)
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum element- "+max);

    }
    
}
