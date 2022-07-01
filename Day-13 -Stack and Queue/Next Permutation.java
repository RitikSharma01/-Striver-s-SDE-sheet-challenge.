/*
    Time Complexity : O(N)
    Space Complexity : O(1)
    
    Where 'N' is the length of the given permutation.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
    {

        int n=permutation.size();

        // Start iterating from the end of the given permutation.
        for (int i = n - 2; i >= 0; i--) 
        {
            if (permutation.get(i) < permutation.get(i + 1)) 
            {
                // Decreasing element found.

                // To store the index of just greater element.
                int id = n - 1;

                // Iterating to find the just greater element.
                for (int j = i + 1; j < n; j++) 
                {
                    if (permutation.get(j) < permutation.get(i)) 
                    {
                        // Element found.
                        id = j - 1;
                        break;
                    }
                }

                // Swap the ith and element at index 'id'.
                Collections.swap(permutation, i, id);

                // Reverse rest of the elements.
                for (int j = 0; j < (n - i) / 2; j++) 
                {
                    Collections.swap(permutation, (i + 1 + j), (n - 1 - j));
                }

                return permutation;
            }
        }

        // Next greater permuation doesn't exists. So, return the smallest one.
        for (int i = 0; i < n; i++) 
        {
            permutation.set(i, i + 1);
        }

        return permutation;
    }
}
