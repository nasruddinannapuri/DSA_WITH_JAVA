package Recursion;

import java.util.Scanner;

public class friendsPairingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(friendsPairing(n));
    }
    public static int friendsPairing(int n){

        // base
        if(n == 1 || n == 2){
            return n;
        }
        // // choice
        // // single
        // int fnm1 = friendsPairing(n-1);

        // // pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1) * fnm2;

        // // totalWays
        // int totalWays = fnm1 + pairWays;
        // return totalWays;
        return friendsPairing(n-1) + (n - 1) * friendsPairing(n-2);
    }
}
