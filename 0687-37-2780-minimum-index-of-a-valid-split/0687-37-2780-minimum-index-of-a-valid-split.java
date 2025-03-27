class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();

        // Step 1: Find the dominant element using Boyer-Moore
        int candidate = -1, count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Count occurrences of dominant element
        int totalCount = 0;
        for (int num : nums) {
            if (num == candidate) totalCount++;
        }

        // If the candidate is not dominant, return -1 (shouldn't happen per constraints)
        if (totalCount * 2 <= n) return -1;

        // Step 3: Find the minimum valid split index
        int leftCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == candidate) leftCount++;

            int rightCount = totalCount - leftCount;
            if (leftCount * 2 > (i + 1) && rightCount * 2 > (n - i - 1)) {
                return i;
            }
        }

        return -1; // No valid split found
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> nums = List.of(1, 2, 2, 2);
        System.out.println(sol.minimumIndex(nums)); // Output: 2
    }
}