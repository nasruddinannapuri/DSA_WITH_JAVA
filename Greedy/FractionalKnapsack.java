package Greedy;

import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        // Approach: weight less and value more  
        // ratio: val more/weight less = more profit

        int[] weights = {10, 20, 30};
        int[] vals = {60, 100, 120};
        int capacity = 50;

        double[][] ratio = new double[vals.length][2];
        // 0th -> ind; 1st col -> ratio;

        for (int i = 0; i < vals.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = vals[i]/(double)weights[i];
        }

        // ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int finalVal = 0;
        for(int i = ratio.length-1; i>=0; i--){
            // include full items
            int ind = (int)ratio[i][0];
            if(capacity >= weights[ind]){
                capacity -= weights[ind];
                finalVal += vals[ind];
            } else{
                // include fractional item
                finalVal += capacity * ratio[i][1];
                capacity = 0;
                break;
            }
        }

        System.out.println("Final value: "+ finalVal);

    }

}
