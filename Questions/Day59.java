

//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Matrix/problem/reversing-the-columns-of-a-matrix-1587115621

class Solution {
    static void reverseCol(int matrix[][]) {
        int n1 = matrix.length;       
        int m1 = matrix[0].length;
        
     
        for (int i = 0; i < n1; i++) 
        {
            int left = 0;
            int right = m1 - 1;
            while (left < right) 
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
        
                left++;
                right--;
            }
        }
    }
}
