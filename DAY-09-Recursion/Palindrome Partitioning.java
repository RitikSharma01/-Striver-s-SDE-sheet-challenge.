import java.util.*;
public class Solution {
    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        palidromePartitioning(s, ans, res);
        return res;
    }

    public static boolean Isplaindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static int palidromePartitioning(String str, List<String> ans, List<List<String>> res) {
        if (str.length() == 0) {
            List<String> base = new ArrayList<>(ans);
            res.add(base);
            return 1;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String ros = str.substring(i + 1);
            String ss = str.substring(0, i + 1);
            if (Isplaindrome(ss)) {
                ans.add(ss);
                count += palidromePartitioning(ros, ans, res);
                ans.remove(ans.size() - 1);
            }
        }
        return count;
    }
}