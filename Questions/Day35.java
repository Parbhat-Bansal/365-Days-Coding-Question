//Question Link :- https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1?page=3&status=solved&sortBy=submissions

class Solution 
{
    public static void rearrange(int arr[]) 
    {
       int n = arr.length;
        Arrays.sort(arr);
        int[] res = new int[n];

        int i = 0, j = n - 1, k = 0;
        while (i <= j) {
            if (i == j) 
            {
                res[k] = arr[i];
                break;
            }
            res[k++] = arr[j--];
            res[k++] = arr[i++];
        }

        for (int x = 0; x < n; x++) 
        {
            arr[x] = res[x];
        }
    }
}
