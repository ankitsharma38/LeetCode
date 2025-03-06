class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n; // Range of numbers: [1, N]
        
        Set<Integer> seen = new HashSet<>();
        int actualSum = 0, repeated = -1;
        
        // Traverse the grid
        for (int[] row : grid) {
            for (int num : row) {
                if (seen.contains(num)) {
                    repeated = num; // Found the repeated number
                }
                seen.add(num);
                actualSum += num;
            }
        }
        
        // Compute the expected sum of numbers from 1 to N
        int expectedSum = (N * (N + 1)) / 2;
        
        // Find the missing number
        int missing = expectedSum - (actualSum - repeated);
        
        return new int[]{repeated, missing};
    }
}
