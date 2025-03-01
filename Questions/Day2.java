// Question Link :- https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?page=2&sortBy=submissions

class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) 
    {
        
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1 ; i >= 0 ; i--) 
        {
           
            while (!s.isEmpty() && s.peek() <= arr[i]) 
            {
                s.pop();
            }

            if (s.isEmpty()) 
            {
                result[i] = -1;
            } 
            
            else 
            {
                result[i] = s.peek();
            }

            s.push(arr[i]);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : result) 
        {
            res.add(num);
        }
        return res;
        
        
    }
}