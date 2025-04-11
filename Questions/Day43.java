

//Question Link :- https://www.geeksforgeeks.org/problems/merge-sort/1?page=1&category=Sorting&sortBy=submissions

class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
         if (l < r) 
         {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    
    public static void merge(int[] arr, int l, int m, int r) 
    {

        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; ++i)
        {
            left[i] = arr[l + i];
        }
        
        for (int j = 0; j < n2; ++j)
        {
            right[j] = arr[m + 1 + j];
        }


        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) 
        {
            if (left[i] <= right[j]) 
            {
                arr[k++] = left[i++];
            } 
            else 
            {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) 
        {
            arr[k++] = left[i++];
        }

        while (j < n2) 
        {
            arr[k++] = right[j++];
        }
    }
    
}
