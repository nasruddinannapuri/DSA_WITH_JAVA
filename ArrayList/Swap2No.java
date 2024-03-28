package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap2No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the no of elements to enter");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            list.add(i,sc.nextInt());
        }
        int ind1 = 1, ind2 = 3;
        swap(list, ind1, ind2);

    }
    public static void swap(ArrayList<Integer> list, int ind1, int ind2){
        int temp = list.get(ind1);
        list.set(ind1, list.get(ind2));
        list.set(ind2, temp);
        System.out.println(list);


    }
}
