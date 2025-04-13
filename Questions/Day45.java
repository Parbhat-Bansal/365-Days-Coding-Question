//Question Link :- https://www.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&category=Sorting&sortBy=submissions

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
      int n = arr.length ;
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      
      for(int i = 0 ; i < n ; i++)
      {
          pq.add(arr[i]);
      }
      
      int f = k -1 ;
      
      for(int i = 0 ; i < f ; i++)
      {
          pq.remove();
      }
      
      
      return pq.peek() ;
    }
}
