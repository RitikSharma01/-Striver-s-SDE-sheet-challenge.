/*
	Time Complexity  : O(N)
	Space Complexity : O(1)

	Where N is the total number of elements in the given array.
*/

import java.util.ArrayList;

public class Solution {
    public static int uniqueElement(ArrayList < Integer > arr) {
        // Declare a variable to store answer and intialize its value to zero.
        int answer = 0;

        // Do xor of all elements and store the result in answer
        for (int element: arr) {
            answer ^= element;
        }

        return answer;
    }
}