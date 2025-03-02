
// Question Link ;- https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&sortBy=submissions

class Solution {
  public:
    int majorityElement(vector<int>& arr) {

      int candidate = 0, count = 1;

        for (int i = 1; i < arr.size(); i++) 
        {
            if (arr[candidate] == arr[i]) 
            {
                count++;
            } 
            else
            {
                count--;
            }

            if (count == 0) 
            {
                candidate = i;
                count = 1;
            }
        }

        count = 0;
        for (int i = 0; i < arr.size(); i++) 
        {
            if (arr[candidate] == arr[i]) 
            {
                count++;
            }
        }

        if (count <= arr.size() / 2) 
        {
            return -1;
        }

        return arr[candidate];
    }
};
