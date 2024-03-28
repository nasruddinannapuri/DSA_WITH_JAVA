package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the no of elements to enter");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            list.add(i,sc.nextInt());
        }
        // Reversing the list - O(n)
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        
    }
    
}
