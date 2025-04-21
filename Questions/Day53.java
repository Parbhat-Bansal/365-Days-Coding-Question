import java.util.*;

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;

        int a = 0, b = n - 1;   // a = top, b = bottom
        int c = 0, d = m - 1;   // c = left, d = right

        while (a <= b && c <= d) {
            // Traverse from left to right
            for (int i = c; i <= d; i++) {
                ans.add(mat[a][i]);
            }
            a++;

            // Traverse from top to bottom
            for (int i = a; i <= b; i++) {
                ans.add(mat[i][d]);
            }
            d--;

            // Traverse from right to left
            if (a <= b) {
                for (int i = d; i >= c; i--) {
                    ans.add(mat[b][i]);
                }
                b--;
            }

            // Traverse from bottom to top
            if (c <= d) {
                for (int i = b; i >= a; i--) {
                    ans.add(mat[i][c]);
                }
                c++;
            }
        }

        return ans;
    }
}
