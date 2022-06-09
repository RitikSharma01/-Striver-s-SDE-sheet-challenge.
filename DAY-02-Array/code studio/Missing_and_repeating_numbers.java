import java.util.ArrayList;

public class Solution {

     public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int r = 0, m = 0;

        // Checking for the repeating number
        for (int i = 0; i < n; i += 1) {
            for (int j = i + 1; j < n; j += 1) {
                int x = arr.get(i);
                int y = arr.get(j);
                if (x == y) {
                    r = arr.get(i);
                    break;
                }
            }
        }

        // Calculating the sum of the array
        int currSum = 0;
        for (int i = 0; i < n; i += 1) {
            currSum += arr.get(i);
        }

        // Sum of the numbers from 1 to n
        int actualSum = n * (n + 1) / 2;

        m = actualSum - (currSum - r);

        int ans[] = new int[]{m, r};

        return ans;
    }
}