
import java.util.HashSet;
import java.util.Set;

public class Solution 
{

    public static int uniqueSubstrings(String input) 
    {
        int n = input.length();
        
        Set<Character> set = new HashSet<>();
        
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) 
        {
          
            // try to extend the range [i, j]
            if (!set.contains(input.charAt(j)))
            {
                set.add(input.charAt(j));
                ans = Math.max(ans, j - i+1);
                j++;
            }
            else 
            {
                set.remove(input.charAt(i));
                i++;
            }
        }
        
        return ans;
    }

}
