

// } Driver Code Ends


// Question Link :- https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1?page=2&status=solved&sortBy=submissions

class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) 
    {
        int N = arr.length;

        
        List<Integer> freq = new ArrayList<>(Collections.nCopies(N, 0));

        
        for (int i = 0; i < N; i++) 
        {
            if (arr[i] >= 1 && arr[i] <= N) 
            {
                freq.set(arr[i] - 1, freq.get(arr[i] - 1) + 1); 
            }
        }
        
        return freq ;
    }
}

      

