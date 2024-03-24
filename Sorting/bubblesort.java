package Sorting;

import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to sort: ");
        int n = sc.nextInt();
        int[] sort = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++){
            sort[i] = sc.nextInt();
        }
        bubble(sort);
        printArr(sort);
    }
    public static void bubble(int[] sort){       // n*(n-1-turn) = O(n) times
                                                // optimized bubble sort: O(n) -
       for(int turn = 0; turn<sort.length-1; turn++){   // arrray already sorted 
        int swap = 0;                            // if no swaps then exit loop.
        for(int j = 0; j<sort.length-1-turn; j++){
            if(sort[j]>sort[j+1]){
                int temp = sort[j+1];
                sort[j+1] = sort[j];
                sort[j] = temp;
                swap++;
            }
        }
        if(swap==0)
            break;

       }
    }
    public static void printArr(int sort[]){
        for(int i = 0; i<sort.length;i++){
            System.out.print(sort[i]+" ");
        }
        System.out.println();
    }
}
