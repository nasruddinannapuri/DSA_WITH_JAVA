package Recursion;

import java.util.Scanner;

public class gridWays {

    /*
     * right turns = no of cols = m
     * down turns = no of reows = n
     * total turns = n+m
     * Time Complexity was: 
     * O(2^n+m) -- worst time complexity
     * It's a exponential to solve and optimize it 
     * we use small trick that was permutation:
     * in my notes
     * total-ways = (n-1 + m-1)! / (n-1)! (m-1)!
     * 
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n,m target location in grid: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(noOfWays(0,0,n,m));
    }
    public static int noOfWays(int i, int j, int n, int m){
        
        if(i==n-1 && j==m-1){
            return  1;
        } else if(i == n || j == n){
            return 0;
        }
        // down:
        int way1 = noOfWays(i+1, j, n, m);
        // right:
        int way2 = noOfWays(i, j+1, n, m);

        // total ways: way1 + way2 = down + right
        return  way1 + way2;
        
    }
    
}
