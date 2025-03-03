class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        
        int n = arr.length ;
        d = d % n ;

        int[] arr1 = new int[d];
        int[] arr2 = new int[n-d];
        int[] res = new int[n];
        
        for (int i = 0; i < d; i++) 
        {
            arr1[i] = arr[i];
        }

        for (int i = d; i < n; i++) 
        {
            arr2[i - d] = arr[i];
        }
        int j = 0;
        for (int i = 0; i < n - d; i++)
        {
            res[j] = arr2[i];
            j++;
        }

        for (int i = 0; i < d; i++) 
        {
            res[j] = arr1[i];
            j++;
        }
        
        for(int i = 0 ; i < n ; i ++)
        {
            arr[i] = res[i] ;
        }
        

    }
}