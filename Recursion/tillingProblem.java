package Recursion;

import java.util.Scanner;

public class tillingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        System.out.println(tiling(n));
    }

    public static int tiling(int n){ // 2 x n (floor size)
        
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        
        // vertical choice
        int fnm1 = tiling(n-1);

        // horizontal choice
        int fnm2 = tiling(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
}
