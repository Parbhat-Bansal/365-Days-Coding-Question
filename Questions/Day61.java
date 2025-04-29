

//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Matrix/problem/make-matrix-beautiful-1587115620

class Solution {
    public static int findMinOperation(int[][] mat) {
        int n = mat.length;

        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        // Calculate sum of each row and column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        // Find the maximum sum among all rows and columns
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, rowSum[i]);
            maxSum = Math.max(maxSum, colSum[i]);
        }

        // Total operations needed = sum of (maxSum - current rowSum[i])
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += (maxSum - rowSum[i]);
        }

        return operations;
    }
}
