//Question Link :- https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1?page=1&difficulty=Hard&status=solved&sortBy=submissions

class Solution {
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int[] arr) {
        int n = arr.length;
        
        int maxNormal = normalMaxSum(arr);
        
        // If all elements are negative, return maxNormal
        if (maxNormal < 0) 
            return maxNormal;
        
        // Compute total sum and invert elements for circular sum calculation
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i]; // Invert the array
        }
        
        // Compute max_circular using total sum - minimum subarray sum
        int maxCircular = arrSum + normalMaxSum(arr); 
        
        return Math.max(maxCircular, maxNormal);
    }

    // Kadane's algorithm to find maximum subarray sum
    private int normalMaxSum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(maxEnding, res);
        }
    
        return res;
    }
}