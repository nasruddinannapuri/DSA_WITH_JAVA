package Recursion;

import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {

        // O(n)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element you want: ");
        int n = sc.nextInt();
        System.out.println("Enter the no: ");
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr, 0));
    }
    public static boolean isSorted(int[] arr, int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
}
