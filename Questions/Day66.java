

//Question Link :- https://www.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1?page=1&category=Matrix&sortBy=submissions

class Solution {
    // Function to modify the matrix such that if a matrix cell matrix[i][j]
    // is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;

        // Arrays to mark rows and columns that need to be updated
        boolean[] rowMark = new boolean[rows];
        boolean[] colMark = new boolean[cols];

        
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (mat[i][j] == 1) {
                    rowMark[i] = true;
                    colMark[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (rowMark[i] || colMark[j]) 
                {
                    mat[i][j] = 1;
                }
            }
        }
    }
}
