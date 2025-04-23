

//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Matrix/problem/search-in-a-matrix-1587115621

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;

        int low = 0, high = n * m - 1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            int midValue = mat[row][col];

            if (midValue == x) 
            {
                return true;
            } 
            else if (midValue < x) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }

        return false;
    }
}
