import java.util.*;
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->m.get(a)-m.get(b));
        for(int a:m.keySet())
        {
            pq.offer(a);
            if(pq.size()>k)
                pq.poll();
        }
        int[] ans=new int[k];
        int p=0;
        while(!pq.isEmpty())
        {
            ans[p++]=pq.poll();
        }
        return ans;
	}

}