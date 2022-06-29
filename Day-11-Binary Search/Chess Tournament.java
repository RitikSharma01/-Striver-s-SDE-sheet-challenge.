import java.util.Arrays;

public class Solution 
{
    public static int chessTournament(int[] positions, int n, int c) 
    {        
        // Sorting all positions of empty rooms
        Arrays.sort(positions);
        
        // l is the least possible answer and r is the max possible answer
        int ans = 0, l = 1,  r = positions[n - 1];
        
        // We will find the answer by using binary search
        while (l <= r) 
        {
            // Lets check whether the allocation is possible for mid
            int mid = (l + r) / 2;
            
            // previousRoom stores the previous occupied empty room
            int count = 1, previousRoom = positions[0];
            
            for (int i = 1; i < n; i++) 
            {
                if (positions[i] - previousRoom >= mid) 
                {
                    count++;
                    previousRoom = positions[i];
                }
            }

            // Compressing length to right half if allocation is possible
            if (count >= c) 
            {
                ans = mid;
                l = mid + 1;
            }

            // Compressing length to left half if allocation is not possible
            else 
            {
                r = mid - 1;
            }
        }

        return ans;
    }
}