// Longest subarray with sum K {positions}
package array;

import java.util.HashMap;
import java.util.Map;

public class Problem11 {
    public static int[] longestSubarrayWithSumK(int[] arr, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == K) {
                maxLen = i + 1;
                start = 0;
                end = i;
            }

            if (map.containsKey(sum - K)) {
                int prevIndex = map.get(sum - K);
                if (i - prevIndex > maxLen) {
                    maxLen = i - prevIndex;
                    start = prevIndex + 1;
                    end = i;
                }
            }

            // Store the first occurrence of sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return new int[]{start, end}; // -1, -1 if not found
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5, 1, 1, -1, 4};
        int K = 7;
        int[] result = longestSubarrayWithSumK(arr, K);
        
        if (result[0] != -1) {
            System.out.println("Longest subarray with sum " + K + " is from index " +
                result[0] + " to " + result[1]);
        } else {
            System.out.println("No subarray with sum " + K + " found.");
        }
        
    }
}
