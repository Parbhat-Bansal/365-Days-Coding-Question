
// User function Template for Java
//Question Link:- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/intersection-of-two-sorted-array-1587115620
class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // add your code here
        int i = 0 , j  = 0 , k = 0 ;
        int m = arr1.length ;
        int n = arr2.length ;
        int p = Math.min(m , n) ;
        int[] res = new int[p];
        
        
        while(i < m && j < n)
        {
            if(arr1[i] < arr2[j])
            {
                i++;
            }
            else if(arr1[i]  > arr2[j])
            {
                j++;
            }
            
            else 
            {
                if(k==0 || res[k-1] != arr1[i])
                {
                    res[k] = arr1[i] ;
                    k++;
                }
                i++;
                j++;
            }    
        }
        ArrayList<Integer> FinalAns = new ArrayList<>();
        for(int x = 0 ; x < k ; x++)
        {
            FinalAns.add(res[x]);
        }
        return FinalAns;
        
    }
}
