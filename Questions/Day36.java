
//Question Link :- https://www.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1?page=3&status=solved&sortBy=submissions

class Solution {
    // Function to find the days of buying and selling stock for max profit.
    int stockBuySell(int arr[]) {
        int n = arr.length ;
        
        int profit = 0 ;
        
        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] > arr[i-1])
            {
                profit += arr[i] - arr[i-1];
            }
        }
        
        return profit ;
    }
}


