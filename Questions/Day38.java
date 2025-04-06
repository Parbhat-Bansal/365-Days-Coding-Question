//Question Link :- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/quick-sort


class Solution {
    
    static void quickSort(int arr[], int low, int high) 
    {
        if (low < high) 
        {
            // pi is partitioning index
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to partition the array
    static int partition(int arr[], int low, int high) 
    {
        int pivot = arr[high]; 
        int i = low - 1;       

        for (int j = low; j < high; j++) 
        {
            if (arr[j] <= pivot) 
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  
    }
}
