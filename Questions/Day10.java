
//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/merge-three-sorted-arrays-1587115620
class Solution
{
    // A[], B[], C[]: input arrays
    //Function to merge three sorted lists into a single list.
    public static int[] MergeTwoSorted(int[] arr1 ,int[] arr2)
    {
        int i = 0 , j = 0 , k = 0 ;
        int m = arr1.length;
        int n = arr2.length ;
        int x = m + n ;
        int[] res = new int[x];
        while(i < m && j < n)
        {
            if(arr1[i] < arr2[j])
            {
                res[k] = arr1[i] ;
                i++;
                k++;
            }
            else if(arr1[i] > arr2[j])
            {
                res[k] = arr2[j];
                j++;
                k++;
            }
            else
            {
                res[k] = arr1[i] ;
                i++ ;
                k++;
            }
        }
        
        while(i < m)
        {
            res[k] = arr1[i];
            i++;
            k++;
        }
        
        while(j < n)
        {
            res[k] = arr2[j];
            j++;
            k++;
        }        
        
        return res ;
        
    }
    public static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here
        int[] tempSort = MergeTwoSorted(A ,B);
        int[] ThreeSortedArray = MergeTwoSorted(tempSort , C);
        
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : ThreeSortedArray)
        {
            result.add(num);
        }
        
        return result ;
    }
}
