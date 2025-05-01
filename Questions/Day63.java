
//Question Link :- https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1?page=2&category=Matrix&sortBy=submissions

class Solution {
    int minRow(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        int minCount = Integer.MAX_VALUE;
        int minRow = 1; // 1-based index

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                minRow = i + 1; // 1-based index
            }
        }

        return minRow;
    }
}
