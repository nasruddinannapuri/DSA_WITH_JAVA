package Sorting;

import java.util.Scanner;

public class countsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to sort: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        counting(arr);
        printArr(arr);
    }
    public static void counting(int[] arr){

    }
    public static void printArr(int sort[]){
        for(int i = 0; i<sort.length;i++){
            System.out.print(sort[i]+" ");
        }
        System.out.println();
    }
}
