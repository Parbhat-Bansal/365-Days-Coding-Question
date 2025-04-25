

// Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Matrix/problem/sum-of-upper-and-lower-triangles-1587115621

class Solution {
    // Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) 
    {
        int upperSum = 0;
        int lowerSum = 0;

        // Traverse the matrix
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (i <= j) 
                {
                    upperSum += matrix[i][j];
                }
                
                if (i >= j) 
                {
                    lowerSum += matrix[i][j];
                }
            }
        }

        // Store results in an ArrayList
        ArrayList<Integer> result = new ArrayList<>();
        result.add(upperSum);
        result.add(lowerSum);
        return result;
    }
}