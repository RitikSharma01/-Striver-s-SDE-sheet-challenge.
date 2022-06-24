
/*
    Time Complexity: O(N * 2^N)
    Space Complexity: O(2^N)

    where N is the number of elements in ARR.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;

public class Solution {
	private static ArrayList<ArrayList<Integer>> subsets;

	public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
		subsets = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(arr);

		int count = 0;

		// Trying all subsets.
		for (int mask = 0; mask < (1 << n); mask++) {

			ArrayList<Integer> cur = new ArrayList<Integer>();
			Boolean unique = true;
			for (int i = 0; i < n; i++) {

				if ((mask & (1 << i)) == 0) {
					// Bit not set.
					continue;
				}

				if (i > 0 && arr[i] == arr[i - 1] && (mask & (1 << (i - 1))) == 0) {
					unique = false;
				}

				if (unique == false) {
					break;
				}

				// Inserting arr[i] to current subset.
				cur.add(arr[i]);
			}

			if (unique) {
				if(count >= 0){
					ArrayList<Integer> temp = new ArrayList<Integer>();
					subsets.add(temp);
					subsets.set(count,cur);
					count++;
				}
			}
		}

		Collections.sort(subsets, new Comparator<ArrayList<Integer>>() {
			public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
				int x = Math.min(a.size(), b.size());
				for (int i = 0; i < x; i++) {
					if ((int) a.get(i) == (int) b.get(i))
						continue;
					else if ((int) a.get(i) > (int) b.get(i))
						return 1;
					else
						return -1;
				}
				if (a.size() > x)
					return 1;
				else if (b.size() > x)
					return -1;

				return 1;
			}
		});

		return subsets;
	}
}