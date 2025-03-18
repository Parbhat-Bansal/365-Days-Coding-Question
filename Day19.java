
// Question Link:- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/binary-array-sorting-1587115620

class Solution {
    // Function to sort the binary array in non-decreasing order
    public void binSort(int[] arr) {
        // code here
        
        int j = 0 ;
        for(int i=0 ; i < arr.length ; i++)
        {
            if(arr[i]==0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        
    }
}
