class Solution {
    public int removeDuplicates(int[] nums) {
        // If the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        int i = 1; // Pointer for placing the next unique element

        for (int j = 1; j < nums.length; j++) {
            // If current element is not equal to the previous one
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j]; // Place the unique element at index i
                i++; // Move the pointer i to the next position
            }
        }

        return i; // i is the count of unique elements
    }
}
