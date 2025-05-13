
//Question Link :- https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

// Kadane's Algo....

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int n = A.size() ;
        int res = A.get(0); 
        int maxi = A.get(0) ;
        
        if(n == 0)
        {
            return 0 ;
        }
        
        
        for(int i = 1 ; i < n ; i++)
        {
            maxi = Math.max(A.get(i) , maxi + A.get(i));
            res = Math.max(res , maxi);
        }
        
        return res ;
    }
}
