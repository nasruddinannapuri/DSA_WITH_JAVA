package Arrays.Arrays1d;

import java.util.Scanner;

class TrappingRainWater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of buildings: ");
        int n = sc.nextInt();
        System.out.println("Enter the heights of the buildings: ");
        int[] heights = new int[n];
        for(int i = 1; i<=n; i++){
            heights[i-1] = sc.nextInt();
        }

        waterTrap(heights);

    }
    public static void waterTrap(int[] arr){ //O(n) time-complexity
        // calculate left max boundary - array
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        int n = arr.length;
        for(int i = 1; i<n; i++){
         /* if(leftMax[i-1]>arr[i]){
                leftMax[i] = leftMax[i-1];
            }
            else{
                leftMax[i] = arr[i];
            }
            */

            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        // calculate right max boundary - array
        int[] rightMax = new int[n];
        rightMax[n-1] = arr[n-1]; 

        for(int i = n-2; i>=0; i--){
        /*  if(rightMax[i+1]>arr[i]){
                rightMax[i] = rightMax[i+1];
            }
            else{
                rightMax[i] = arr[i];
            }

            */

            rightMax[i] = Math.max(rightMax[i+1], arr[i]);
        }
        //  loop
        int trappedWater = 0;
        for(int i = 0; i<n; i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterlevel-arr[i];
        }

        System.out.println(trappedWater);
        /*
        int[] waterLevel = new int[arr.length];
        for(int i = 0; i<n; i++){
            waterLevel[i] = (int) Math.min(leftMax[i],rightMax[i]);
        }

        int[] trappedWater = new int[arr.length];
        for( int i = 0; i<n; i++){
            trappedWater[i] = waterLevel[i] - arr[i]; 
        }
        
        int level = 0;
        for(int i = 0; i<n; i++){
            level += trappedWater[i];
        }
        System.out.println(level);
        */
        
        //waterlevel = min(leftmax bound, rightmax bound)
        //trapped water = waterlevel - height[i]
    }
}