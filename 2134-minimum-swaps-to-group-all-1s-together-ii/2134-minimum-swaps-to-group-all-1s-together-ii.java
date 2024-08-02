class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int numOf1 = 0;

        // Count the number of 1's in the array
        for (int num : nums) {
            if (num == 1) {
                numOf1++;
            }
        }

        if (numOf1 == 0) return 0; // No swaps needed if there are no 1's
        if (numOf1 == n) return 0; // No swaps needed if all are 1's

        // Create a window and calculate the number of 1's in the initial window
        int maxOnesInWindow = 0;
        for (int i = 0; i < numOf1; i++) {
            if (nums[i] == 1) {
                maxOnesInWindow++;
            }
        }

        int currOnes = maxOnesInWindow;
        for (int i = 1; i < n; i++) {
            currOnes += nums[(i + numOf1 - 1) % n] - nums[(i - 1) % n];
            maxOnesInWindow = Math.max(maxOnesInWindow, currOnes);
        }

        return numOf1 - maxOnesInWindow;
    }
}
