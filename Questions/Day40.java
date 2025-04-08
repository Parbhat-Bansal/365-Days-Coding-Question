

//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/find-triplets-with-zero-sum

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); 

        for (int i = 0; i < n - 2; i++) 
        {
            int left = i + 1;
            int right = n - 1;

            while (left < right) 
            {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) 
                {
                    return true; // Found the triplet
                } 
                
                else if (sum < 0) 
                {
                    left++;
                } 
                
                else 
                {
                    right--;
                }
            }
        }
        return false;
        
    }
}