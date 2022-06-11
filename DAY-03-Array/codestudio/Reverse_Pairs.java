import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        int n = arr.size();
        int count =0;
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
               if(i<j && arr.get(i)> 2 * arr.get(j))
                   count++;
            }
        }
        return count;
    }
}