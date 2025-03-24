

// Question Link:- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/merge-two-sorted-arrays-1587115620

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        if(a == null)
        {
            return ;
        }
        int m = a.length, n = b.length;
        int i = m - 1, j = 0;

        
        while (i >= 0 && j < n && a[i] > b[j]) 
        {
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
            i--; 
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}

    
