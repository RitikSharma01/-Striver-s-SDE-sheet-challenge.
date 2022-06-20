import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
    long left_max[]=new long[n];
        long right_max[]=new long [n];
       long trap=0;
        left_max[0]=arr[0];
        right_max[n-1]=arr[n-1];
        for (int i=1;i<n;i++ ){
            left_max[i]=Math.max(arr[i],left_max[i-1]);
        }
       for (int i=n-2;i>=0;i-- ){
            right_max[i]=Math.max(arr[i],right_max[i+1]);
        }  
         for (int i=0;i<n;i++ ){ 
           trap=trap+(Math.min(right_max[i],left_max[i])-arr[i]);  
         }
        return trap;
    }
}
