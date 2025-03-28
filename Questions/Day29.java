//Question Link:- https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&status=solved&sortBy=submissions

class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        int n =arr.length ;
        int res = arr[0]; 
        int maxi = arr[0];

        for (int i = 1; i < n; i++) 
        {
            maxi = Math.max(arr[i], maxi + arr[i]); 
            res = Math.max(res, maxi);             
        }

        return res;
        
    }
}
