package Recursion;

import java.util.Scanner;

public class xpowern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x ");
        int x = sc.nextInt();
        System.out.println("Enter the n ");
        int n = sc.nextInt();
        System.out.println(power(x, n));
        System.out.println(optimizedPower(x, n));

    }  
    public static int power(int x, int n){

        // O(n)
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x*xnm1;
        // return xn;
        return x * power(x, n-1);
    }  
    
    // optimized one: O(log n)
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimizedPower(x, n/2);
        int halfPowerSqr = halfpower*halfpower;
        if(n %2 != 0){
            halfPowerSqr = x * halfPowerSqr; 
        }
        return halfPowerSqr;
    }
}
