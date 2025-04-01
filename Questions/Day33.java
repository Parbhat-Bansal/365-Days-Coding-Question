//Question Link:- https://www.geeksforgeeks.org/problems/binary-search-1587115620/1?page=1&status=solved&sortBy=submissions

class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
         int low = 0, high = arr.length - 1; 
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
        
            if (arr[mid] > k) {
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        
        return -1;
    }
}