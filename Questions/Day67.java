//Question Link :- https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        int n = A.size() ;
        int steps = 0 ;
        
        for(int i = 0 ; i < n-1 ; i++)
        {
            int xdiff = Math.abs(A.get(i+1) - A.get(i));
            int ydiff = Math.abs(B.get(i+1) - B.get(i));
            
            steps += Math.max(xdiff , ydiff );
        }
        return steps;
    }
}
