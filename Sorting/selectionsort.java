package Sorting;

import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements to sort: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selection(arr);
        printArr(arr);
    }

    public static void selection(int[] arr){
        for(int i = 0; i< arr.length-1; i++){  // O(n) 
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int sort[]){
        for(int i = 0; i<sort.length;i++){
            System.out.print(sort[i]+" ");
        }
        System.out.println();
    }
}
