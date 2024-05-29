package Heap;
import java.util.*;

public class PQ {

    // Comparing of objects:
    static class Student implements Comparable<Student> { // Override
        String name;
        int rank;

        
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        // for comparing object -> either it may be rank or name basis
        @Override
        public int compareTo(Student s){
            return this.rank - s.rank;
        }

    }
    public static void main(String[] args) {
        /* PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2); // O(logn)
        pq.add(1);
        pq.add(3);
        pq.add(6);
        pq.add(4);
        while(!pq.isEmpty()){
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        } */
 
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Nasru",20));
        pq.add(new Student("Nasa",10));
        pq.add(new Student("ramu",30));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
        // for Objects:
    }
}
