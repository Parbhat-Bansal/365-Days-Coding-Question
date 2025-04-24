

//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Matrix/problem/determinant-of-a-matrix-1587115620

class Solution
{
    // Function to get cofactor of matrix[p][q] in temp[][]. n is current dimension
    static void getCofactor(int[][] matrix, int[][] temp, int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) 
        {
            for (int col = 0; col < n; col++) 
            {
                if (row != p && col != q) 
                {
                    temp[i][j++] = matrix[row][col];
                    if (j == n - 1) 
                    {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    // Function for finding determinant of matrix
    static int determinantOfMatrix(int[][] matrix, int n)
    {
        if (n == 1)
            return matrix[0][0];

        int det = 0; 
        int[][] temp = new int[n][n]; 
        int sign = 1;

        for (int f = 0; f < n; f++) 
        {
            getCofactor(matrix, temp, 0, f, n);
            det += sign * matrix[0][f] * determinantOfMatrix(temp, n - 1);
            sign = -sign;
        }

        return det;
    }
}
