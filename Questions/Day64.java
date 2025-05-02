
//Question Link :- https://www.geeksforgeeks.org/problems/c-matrix-rotation-by-180-degree0745/1?page=5&category=Matrix&sortBy=submissions

class Solution {
    public void rotateMatrix(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n; j++) {
                // If (i == n-1-i && j >= n/2), you would swap same row elements twice
                // So handle only necessary swaps
                int i2 = n - 1 - i;
                int j2 = n - 1 - j;

                // Swap only once
                if (i < i2 || (i == i2 && j < j2)) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[i2][j2];
                    mat[i2][j2] = temp;
                }
            }
        }
    }
}
