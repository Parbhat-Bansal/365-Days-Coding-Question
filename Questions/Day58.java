
//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Matrix/problem/exchange-matrix-columns-1587115620

class Solution {
    // Function to exchange first column of a matrix with its last column.
    static void exchangeColumns(int matrix[][]) {
        int n1 = matrix.length;        // number of rows
        int m1 = matrix[0].length;      // number of columns
        
        for (int i = 0; i < n1; i++) {
            // Swap the first and last column elements for each row
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][m1 - 1];
            matrix[i][m1 - 1] = temp;
        }
    }
}
