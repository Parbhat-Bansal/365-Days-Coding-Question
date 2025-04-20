

//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Matrix/problem/boundary-traversal-of-matrix-1587115620

class Solution {
    // Function to return list of integers that form the boundary
    // traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int rows = mat.length;
        int cols = mat[0].length;

        // Special case: Single row
        if (rows == 1) 
        {
            for (int i = 0; i < cols; i++)
            {
                ans.add(mat[0][i]);
            }
        }
        // Special case: Single column
        else if (cols == 1) 
        {
            for (int i = 0; i < rows; i++)
            {
                ans.add(mat[i][0]);
            }
        }
        // General case
        else 
        {
            // Top row
            for (int i = 0; i < cols; i++)
            {
                ans.add(mat[0][i]);
            }

            // Right column
            for (int i = 1; i < rows; i++)
            {
                ans.add(mat[i][cols - 1]);
            }

            // Bottom row (right to left)
            for (int i = cols - 2; i >= 0; i--)
            {
                ans.add(mat[rows - 1][i]);
            }

            // Left column (bottom to top)
            for (int i = rows - 2; i >= 1; i--)
            {
                ans.add(mat[i][0]);
            }
        }
        
        return ans ;
    }
}

        
        
 