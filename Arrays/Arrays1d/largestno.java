package Arrays.Arrays1d;

import java.util.Scanner;

public class largestno {
    public static int getLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+smallest);
        return largest;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the Elements: ");
        for(int i = 0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        int lar = getLargest(numbers);
        System.out.println("Largest number in an array: "+lar);
        
    }
    
}
