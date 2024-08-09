class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        // Define directions: east, south, west, north
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        // Result array to store the coordinates
        int[][] result = new int[rows * cols][2];
        
        // Initialize starting point and step size
        int x = rStart, y = cStart, step = 1;
        int directionIndex = 0;  // Start by moving east
        int index = 0;  // To track the number of cells filled in result

        // Visit the first cell
        result[index++] = new int[]{x, y};
        
        // While we haven't filled the result array
        while (index < rows * cols) {
            // Move in the current direction for `step` cells
            for (int i = 0; i < step; i++) {
                x += directions[directionIndex][0];
                y += directions[directionIndex][1];
                
                // Check if the new position is within grid bounds
                if (x >= 0 && x < rows && y >= 0 && y < cols) {
                    result[index++] = new int[]{x, y};
                }
            }

            // Change direction clockwise
            directionIndex = (directionIndex + 1) % 4;
            
            // Increase step size after completing a full turn (2 directions)
            if (directionIndex == 0 || directionIndex == 2) {
                step++;
            }
        }
        
        return result;
    }
}
