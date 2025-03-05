//Questoin Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/minimum-difference-in-an-array

class Solution{
    //Function to find minimum difference between any pair of elements in an array.
    public static int MinimumDifference(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int i = 1  ; i < n ; i++)
        {
            int temp = arr[i] - arr[i-1] ;
            if(temp >= 0)
            {
                if(temp < diff)
                {
                    diff = temp ;    
                }
            }
        }
        return diff ;
    }
};