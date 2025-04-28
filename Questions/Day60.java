
//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Matrix/problem/reversing-the-rows-of-a-matrix-1587115621

class Solution {
    // Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][]) 
    {
        int n1 = matrix.length;
        int m1 = matrix[0].length;
        
        int top = 0;
        int bottom = n1 - 1;
        
        // Swap rows from top and bottom
        while (top < bottom) {
            for (int col = 0; col < m1; col++) 
            {
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }
    }
}
