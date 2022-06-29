public class Solution {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        int sortedRows[] = new int[m + n];

        int a = 0, b = 0, c = 0;

        // Iterate while a is less than m and b is less than n
        while (a < m && b < n) {
            if (row1[a] < row2[b]) {
                sortedRows[c] = row1[a];
                a++;
            } else {
                sortedRows[c] = row2[b];
                b++;
            }

            c++;
        }

        // Iterate while a is less than m
        while (a < m) {
            sortedRows[c] = row1[a];
            a++;
            c++;
        }

        // Iterate while b is less than n
        while (b < n) {
            sortedRows[c] = row2[b];
            b++;
            c++;
        }

        return sortedRows[k - 1];

    }
}
