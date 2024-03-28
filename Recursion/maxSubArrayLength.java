import java.util.*;
public class maxSubArrayLength {
	public static void main(String[] args) {
	    int[] arr={5,5,5,5,5,5,5};
	    int k = 4;
        int sol = maxLength(arr,k);
	    System.out.println(sol);
	  }
	public static int maxLength(int[] arr, int k) {
	        int j=0;
	        int max=0;
	        // int k=4;
	       HashMap<Integer,Integer> mp=new HashMap<>();
	    //    int[] arr={5,5,5,5,5,5,5};
	       for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
	           while(mp.get(arr[i])>k){
	               mp.put(arr[j],mp.getOrDefault(arr[j],0)-1);
	              
	               j++;
	           }
	           max=Math.max(max,i-j+1);
	       }
	       return max;
	}

    }
