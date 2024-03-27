package Recursion;

import java.util.Scanner;

public class findSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        subSet(str, "", 0);
    }
    public static void subSet(String str, String ans, int i){
        // base case
        if(i == str.length()){
            if(ans.length()== 0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        // recursion
        // Yes choice
        subSet(str, ans+str.charAt(i), i+1);

        // No choice
        subSet(str, ans, i+1);
    }
    
}
