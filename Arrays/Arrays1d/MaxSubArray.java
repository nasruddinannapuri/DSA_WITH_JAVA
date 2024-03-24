package Arrays.Arrays1d;

import java.util.Scanner;

public class MaxSubArray {

// Brute force:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        subArray(arr);

    }
    public static void subArray(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int start = i;
            for(int j = i; j<arr.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    currSum = currSum+ arr[k];
                    
                }
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}


// prefix array:

