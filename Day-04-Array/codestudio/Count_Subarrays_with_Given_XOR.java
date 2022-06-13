import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		int n = arr.size();

		// To store the prefix XOR's.
		HashMap<Integer, Integer> prefXor = new HashMap<Integer, Integer>();

		int ans = 0;

		// To keep track of the current xor.
		int currXor = 0;

		// Intialy Xor is 0.
		prefXor.put(0, 1);

		for (int i = 0; i < n; i++) {
			// Update the Xor of the current prefix.
			currXor = currXor ^ arr.get(i).intValue();

			// Required value of the prefix Xor to make the xor of the subarray ending at
			// the current index equal to X.
			int req = x ^ currXor;

			// Add the count of prefix arrays with required xor.
			if (prefXor.containsKey(req)) {
				ans += prefXor.get(req);
			}

			if (prefXor.containsKey(currXor)) {
				prefXor.put(currXor, prefXor.get(currXor) + 1);
			} else {
				prefXor.put(currXor, 1);
			}
		}

		return ans;
	}
}