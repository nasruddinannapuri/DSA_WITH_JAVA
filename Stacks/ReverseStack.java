package Stacks;
import Stacks.PushBottom;

import java.util.Stack;

public class ReverseStack { // O(n) time complexity O(1) space complexity

    public static void reverseStack(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }
        PushBottom s = new PushBottom();
        int top = st.pop();
        reverseStack(st);
        s.pushAtBottom(st, top);


    }

    public static void printStack(Stack<Integer> st){
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        reverseStack(st);
        printStack(st);

    }
}
