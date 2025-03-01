
// Question Link :- https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&sortBy=submissions

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<>() ;
        int n = arr.length ;
        
        for(int i = 0 ; i < n ; i++)
        {
            int currSum =0 ;
            for(int j = i ; j < n ; j++)
            {
                currSum += arr[j] ;
                if(currSum == target)
                {
                    res.add(i+1);
                    res.add(j+1);
                    return res ;
                }
            }
            
        }
        res.add(-1);
        return res ;
    }
}