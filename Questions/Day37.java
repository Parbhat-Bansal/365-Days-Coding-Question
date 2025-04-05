//Question Link :- https://www.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1?page=1&difficulty=Medium&status=solved&sortBy=submissions
class Solution {

    public int towerOfHanoi(int n, int from, int to, int aux) {
        int moves = 0;
        if (n >= 1) {
            
            moves += towerOfHanoi(n - 1, from, aux, to);
            moves++;

            moves += towerOfHanoi(n - 1, aux, to, from);
        }
        return moves;
    }
}
        
