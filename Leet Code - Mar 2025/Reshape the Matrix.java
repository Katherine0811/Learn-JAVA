class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        // check if parameter is legal, else return ori matrix
        if (r * c != m * n) {
            return mat;
        }
        // create a new array
        int[][] newMat = new int[r][c];
        // loop ori array, fill in to new array
        for (int i = 0; i < m * n; i++) {
            newMat[i / c][i % c] = mat[i / n][i % n];
        }
        // return new array
        return newMat;
    }
}