

//Question Link:- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/sort-an-array-of-0s-1s-and-2s-1587115621

class Solution
{
    // Function to sort an array of 0s, 1s and 2s
    public static void segragate012(int arr[], int N){
        // Your Code Here
        int low = 0, mid = 0, high = N - 1;
        
        while (mid <= high) 
        {
            switch (arr[mid]) 
            {
                case 0:
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                    
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        
        }
    }
}