
//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/count-possible-triangles-1587115620

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        int n = arr.length;
        int count = 0;

        Arrays.sort(arr); // Sort the array

        // Fix the third side (largest side in the triplet)
        for (int i = n - 1; i >= 2; i--) 
        {
            int left = 0;
            int right = i - 1;

            while (left < right) 
            {
                if (arr[left] + arr[right] > arr[i]) 
                {
                    count += (right - left);
                    right--;
                } 
                else 
                {
                    left++;
                }
            }
        }

        return count;
    }
}