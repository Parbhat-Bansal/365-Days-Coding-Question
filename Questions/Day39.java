//Question Link :- https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&category=Arrays&difficulty=Medium,Hard&status=solved&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
  public void sort012(int[] arr) 
  {
    int low = 0, mid = 0, high = arr.length - 1;
    
    while (mid <= high) 
    {
        if (arr[mid] == 0) 
        {
            // swap arr[low] and arr[mid]
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;
            
        } 
        else if (arr[mid] == 1) 
        {
            mid++;
        } 
        else 
        {
            // arr[mid] == 2
            // swap arr[mid] and arr[high]
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--; // Don't increment mid here
        }
    }

  }
}



