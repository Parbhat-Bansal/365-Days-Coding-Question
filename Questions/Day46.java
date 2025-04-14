

//Ques Link :- https://www.geeksforgeeks.org/problems/the-celebrity-problem/1?page=3&category=Arrays&sortBy=submissions

class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int candidate = 0;

        // Step 1: Find the candidate using two-pointer approach
        for (int i = 1; i < n; i++) {
            if (mat[candidate][i] == 1) {
                // Candidate knows i, so candidate cannot be the celebrity
                candidate = i;
            }
        }

        // Step 2: Verify the candidate
        for (int i = 0; i < n; i++) {
            // If candidate knows anyone or if anyone doesn't know candidate, return -1
            if (i != candidate && (mat[candidate][i] == 1 || mat[i][candidate] == 0)) {
                return -1;
            }
        }

        // If the candidate satisfies the conditions, return the candidate
        return candidate;
    }
}