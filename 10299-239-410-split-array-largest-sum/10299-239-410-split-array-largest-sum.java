class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num; // `right` is the sum of all elements in the array
        }
        while (left < right) {
            int mid = (right + left) / 2;
            if (canSplitIn(nums, mid) <= k) {
                // Try a smaller largest sum
                right = mid;
            } else {
                // Increase the largest sum
                left = mid + 1;
            }
        }
        return left;
    }
    private int canSplitIn(int[] nums, int maxSum) {
        int noOfSubarrays = 1, currentSum = 0;
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                // Start a new subarray
                noOfSubarrays++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }
        return noOfSubarrays;
    }
}
