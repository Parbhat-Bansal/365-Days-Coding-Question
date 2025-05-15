

//Question Link :-  https://www.geeksforgeeks.org/problems/magic-square/1?page=7&category=Matrix&sortBy=submissions

class Solution {
    public static String magicSquare(int[][] mat) {
        int n = mat.length;
        int maxVal = n * n;
        int[] count = new int[maxVal + 1]; // index 0 is unused
        int targetSum = 0;


        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                int val = mat[i][j];
                if (val < 1 || val > maxVal || count[val] != 0) {
                    return "Not a Magic Square"; 
                }
                count[val] = 1;
            }
        }


        //Find Out the target Sum 
        for (int j = 0; j < n; j++)
        {
            targetSum += mat[0][j];
        }

        // Check row sums
        for (int i = 0; i < n; i++) 
        {
            int rowSum = 0;
            for (int j = 0; j < n; j++) 
            {
                rowSum += mat[i][j];
            }
            if (rowSum != targetSum) 
            {
                return "Not a Magic Square";
            }
        }

        // Check column sums
        for (int j = 0; j < n; j++) 
        {
            int colSum = 0;
            for (int i = 0; i < n; i++) 
            {
                colSum += mat[i][j];
            }
            if (colSum != targetSum) 
            {
                return "Not a Magic Square";
            }
        }

        // Check main diagonal
        int diag1 = 0;
        for (int i = 0; i < n; i++) 
        {
            diag1 += mat[i][i];
        }
        if (diag1 != targetSum) 
        {
            return "Not a Magic Square";
        }

        // Check secondary diagonal
        int diag2 = 0;
        for (int i = 0; i < n; i++) 
        {
            diag2 += mat[i][n - i - 1];
        }
        if (diag2 != targetSum) 
        {
            return "Not a Magic Square";
        }

        return "Magic Square";
    }
}

