import java.util.*;

public class Solution {
    public static int longestSubarrayWithSumK(int[] a, long k) {

        HashMap<Long, Integer> map = new HashMap<>();

        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < a.length; i++) {

            sum += a[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            long rem = sum - k;

            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}