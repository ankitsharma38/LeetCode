class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        ArrayList<Integer> subarraySums = new ArrayList<>();
        
        // Computing sums of all possible subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                subarraySums.add(sum);
            }
        }
        
        // Sorting the list of subarray sums
        Collections.sort(subarraySums);
        
        // Computing the sum of the elements from index left to right
        long result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + subarraySums.get(i)) % mod;
        }
        
        return (int) result;
    }
}