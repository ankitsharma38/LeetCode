class Solution {
    public int maximumCandies(int[] candies, long k) {
        if (k > Arrays.stream(candies).mapToLong(i -> i).sum()) return 0;
        
        int left = 1, right = Arrays.stream(candies).max().getAsInt(), ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(candies, mid, k)) {
                ans = mid;
                left = mid + 1; // Try for a larger candy amount
            } else {
                right = mid - 1; // Reduce the candy amount
            }
        }
        return ans;
    }
    private boolean canDistribute(int[] candies, int mid, long k) {
        long count = 0;
        for (int c : candies) {
            count += c / mid; // Number of children that can be served from this pile
        }
        return count >= k;
    }
}
