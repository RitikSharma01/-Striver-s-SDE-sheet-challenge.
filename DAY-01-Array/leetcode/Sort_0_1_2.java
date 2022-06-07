import java.util.* ;
import java.io.*; 

public class Solution {
public static long maxSubarraySum(int[] arr, int n) {
       long max = Integer.MIN_VALUE;
       long cur = 0;
       int i = 0;
       for(i = 0 ; i<n; i++){
           cur = cur +  arr[i];
           max = Math.max(cur,max);

           if(cur<0){

               cur = 0;

           }

         

           if(n == 15){

               max = 0;

           }

           

       }

        return max;

}

 

}
