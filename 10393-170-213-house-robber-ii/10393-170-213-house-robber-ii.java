class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        if (n == 1) return arr[0];
        if (n == 2) return Math.max(arr[0], arr[1]); 
        
        return Math.max(robLinear(arr, 0, n - 2), robLinear(arr, 1, n - 1));
    }

    private int robLinear(int[] arr, int start, int end) {
        int prev2 = 0, prev1 = 0;
        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1, prev2 + arr[i]);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}