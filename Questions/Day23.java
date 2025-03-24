//Question Link :- https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1?page=1&status=solved&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions

class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int totalSum = 0;

       
        for (int i = 0; i < n; i++) 
        {
            totalSum += arr[i];
        }

        int leftSum = 0;

       
        for (int i = 0; i < n; i++) 
        {
            totalSum -= arr[i]; 

            if (leftSum == totalSum)
            {
                return i ; 
            }

            leftSum += arr[i]; 
        }

        return -1; 
    }

}