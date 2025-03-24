// Question Link :- https://www.geeksforgeeks.org/problems/reverse-array-in-groups0255/1?page=2&status=solved&sortBy=submissions
class Solution {

    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size() ;
        for (int i = 0; i < n; i += k) 
        {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            
            while (left < right) 
            {
                long temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
    }
}