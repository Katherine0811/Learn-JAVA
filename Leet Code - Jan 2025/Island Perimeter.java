class Solution {
    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    // perimeter is 4 by default
                    result += 4;
                    //neighbour island should remove connecting side
                    if (i != 0 && grid[i - 1][j] == 1) {
                        result -= 2;
                    }
                    if (j != 0 && grid[i][j - 1] == 1) {
                        result -= 2;
                    }
                }
            }
        }
        return result;
    }
}