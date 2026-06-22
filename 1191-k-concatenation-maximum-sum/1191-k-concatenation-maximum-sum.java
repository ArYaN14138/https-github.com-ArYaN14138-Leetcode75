class Solution {

    public int kConcatenationMaxSum(int[] arr, int k) {

        long mod = 1000000007L;

        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        long curr = 0;
        long maxSum = 0;

        int times = (k == 1) ? 1 : 2;

        for (int i = 0; i < times * arr.length; i++) {

            curr += arr[i % arr.length];

            if (curr < 0) {
                curr = 0;
            }

            maxSum = Math.max(maxSum, curr);
        }

        if (k > 2 && totalSum > 0) {
            maxSum += (long)(k - 2) * totalSum;
        }

        return (int)(maxSum % mod);
    }
}
