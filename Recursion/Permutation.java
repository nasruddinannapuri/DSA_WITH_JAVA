package Recursion;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        permutation(str, "");
    }
    public static void permutation(String str, String sol){
        //  base case
        if(str.length()== 0){
            System.out.println(sol);
            return;
        }
        // recursion
        for(int i = 0; i< str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            permutation(newStr, sol+curr);
        }
    }
    
}
