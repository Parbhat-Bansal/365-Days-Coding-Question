

//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Matrix/problem/print-matrix-in-snake-pattern-1587115621

class Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        ArrayList<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        if (rows == 0) return result;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) 
        {
            
            if (i % 2 == 0) {
                // Left to right
                for (int j = 0; j < cols; j++) 
                {
                    result.add(matrix[i][j]);
                }
            } 
            else 
            {
                // Right to left
                for (int j = cols - 1; j >= 0; j--) 
                {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}