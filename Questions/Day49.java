
//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/closer-to-sort-1587115620

class Solution
{
  
    static long closer(int arr[], int n, long x)
    {
        // add your code here
        int low = 0, high = n - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            // Check mid
            if (arr[mid] == x)
                return mid;

            // Check mid - 1 (if within bounds)
            if (mid > low && arr[mid - 1] == x)
                return mid - 1;

            // Check mid + 1 (if within bounds)
            if (mid < high && arr[mid + 1] == x)
                return mid + 1;

            // Adjust search range
            if (x < arr[mid])
                high = mid - 2;
            else
                low = mid + 2;
        }

        // Element not found
        return -1;
    }
}