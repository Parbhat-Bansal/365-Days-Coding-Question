//Question Link :- https://www.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1?page=2&status=solved&sortBy=submissions
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        int n = arr.length; 
        Arrays.sort(arr);
        int res = 1;  
    
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == res) 
            {
                res++;  
            }
        }

        return res;
    }
}