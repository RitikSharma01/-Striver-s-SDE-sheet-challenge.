import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		int count = 0;
        int candidate = 0;
        for(int num : arr){
            if(count == 0) candidate = num;
            if(candidate == num) count++;
            else count--;
        }
        count = 0;
        for(int num : arr){
           if(num == candidate) count++;
        }
        if(count<=n/2) return -1;
        return candidate;
	}
}