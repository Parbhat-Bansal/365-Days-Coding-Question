
// User function Template for Java

//Question Link :- https://www.geeksforgeeks.org/problems/print-diagonally4331/1?page=3&category=Matrix&sortBy=submissions

class Solution {
    static ArrayList<Integer> downwardDiagonal(int N, int A[][]) 
    {
        ArrayList<Integer> result = new ArrayList<>();

        // Traverse all anti-diagonals (sum of i + j ranges from 0 to 2N-2)
        for (int sum = 0; sum <= 2 * (N - 1); sum++) 
        {
            for (int i = 0; i < N; i++) 
            {
                int j = sum - i;
                if (j >= 0 && j < N) 
                {
                    result.add(A[i][j]);
                }
            }
        }

        return result;
    }
}
