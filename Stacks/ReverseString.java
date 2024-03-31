package Stacks;
import java.util.*;

import Recursion.removeDuplicate;

public class ReverseString {
    // microsoft, abode, amazon, flipkart

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int ind = 0;
        while(ind<str.length()){
            s.push(str.charAt(ind));
            ind++;
        }
        /* 
        System.out.println("Reversed String: ");
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        } 
        */
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            result.append(s.pop());
        }
        return result.toString();
        // System.out.println(result);

    }
    public static void main(String[] args) {
        ReverseString s = new ReverseString();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        System.out.println(reverseString(str));
    }

    
}
