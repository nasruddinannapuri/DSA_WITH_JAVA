package Recursion;

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = new String();
        str = sc.next();
        duplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void duplicate(String str, int idx , StringBuilder newStr, boolean map[]) {
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            // duplicate
            duplicate(str, idx+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            duplicate(str, idx+1, newStr.append(currChar), map);
        }
       
    }
}
