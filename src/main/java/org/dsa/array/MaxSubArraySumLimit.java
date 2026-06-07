package org.dsa.array;

public class MaxSubArraySumLimit {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 5};
        int n=5;
        int B =12;
        System.out.println(new MaxSubArraySumLimit().maxSubarray(5,12,arr));
    }

    public int maxSubarray(int n, int limit, int[] arr) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0;

        for (int i = 0; i < n; i++) {
            curr_sum += arr[i];
            //System.out.println(i);
            // Shrink window if it exceeds limit
            while (curr_sum > limit && start <= i) {
                curr_sum -= arr[start];

                start++;
            }

            // Update max_sum if valid
            if (curr_sum <= limit) {
                max_sum = Math.max(max_sum, curr_sum);
            }
        }

        return max_sum == Integer.MIN_VALUE ? 0 : max_sum;
    }
}
