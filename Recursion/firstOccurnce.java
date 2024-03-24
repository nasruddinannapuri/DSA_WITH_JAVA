package Recursion;

import java.util.Scanner;

public class firstOccurnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element you want: ");
        int n = sc.nextInt();
        System.out.println("Enter the no: ");
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to search: ");
        int key = sc.nextInt();
        
        System.out.println(occurance(arr, 0, key));
        System.out.println(last(arr,0, key));
    }

    public static int occurance(int[] arr, int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return occurance(arr, i+1, key);

    }

    public static int last(int[] arr, int i, int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = last(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
}
