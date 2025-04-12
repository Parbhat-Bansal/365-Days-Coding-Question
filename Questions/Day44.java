//Question Link :- https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1?page=1&category=Sorting&sortBy=submissions

class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        Arrays.sort(arr);
        int n = arr.length ;
        
        for(int i = 0 ; i < n ; i++)
        {
            int left = i + 1 ;
            int right = n -1 ;
            
            while(left < right)
            {
                int sum = arr[i] + arr[left] + arr[right] ;
                
                if(sum == target)
                {
                    return true;
                }
                
                else if(sum < target)
                {
                    left ++ ;
                }
                
                else
                {
                    right -- ;
                }
            }
        }
        
        return false ;
    }
}
