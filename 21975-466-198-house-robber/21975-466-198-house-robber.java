class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];

        int prev2 = 0;
        int prev1 = nums[0];
        int maxLoot = prev1;

        for(int i=1; i<n; i++){
            maxLoot = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = maxLoot;
        }
        return maxLoot;
    }
}