
//Question link :- https://www.geeksforgeeks.org/problems/reverse-spiral-form-of-matrix4033/1?page=5&category=Matrix&sortBy=submissions

class Solution {
    public int[] reverseSpiral(int R, int C, int[][] a) {
        int[] result = new int[R * C];
        int index = 0;

        int top = 0, bottom = R - 1;
        int left = 0, right = C - 1;

        // Step 1: Normal Spiral Traversal
        while (top <= bottom && left <= right) {
            // Traverse from Left to Right (top row)
            for (int i = left; i <= right; i++) {
                result[index++] = a[top][i];
            }
            top++;

            // Traverse from Top to Bottom (right column)
            for (int i = top; i <= bottom; i++) {
                result[index++] = a[i][right];
            }
            right--;

            // Traverse from Right to Left (bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[index++] = a[bottom][i];
                }
                bottom--;
            }

            // Traverse from Bottom to Top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = a[i][left];
                }
                left++;
            }
        }

        // Step 2: Reverse the result array
        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = temp;
        }

        return result;
    }
}
