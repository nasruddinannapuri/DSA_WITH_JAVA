package Heap;

import java.util.PriorityQueue;

public class ConnectNRopes {

    public static int connectRopes(int[] ropes) {
        if (ropes == null || ropes.length == 0)
            return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        int sum = 0;
        while (pq.size() > 1) {
            int a = pq.remove();
            int b = pq.remove();
            sum += a + b;
            pq.add(a + b);
        }

        return sum;
        
    }

    public static void main(String[] args) {
        int[] ropes = { 2, 3, 3, 4, 6 };
        System.out.println("Sum of Connected N Ropes is: "+connectRopes(ropes));
    }

}
