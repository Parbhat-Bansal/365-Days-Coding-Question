

//Question Link :- https://www.geeksforgeeks.org/problems/rightmost-different-bit-1587115621/1?page=4&status=solved&sortBy=submissions

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
          int count = 0 ;
          while(m > 0|| n > 0)
          {
              if((m & 1) == (n & 1))
              {
                  count ++; 
                  m = (m >> 1);
                  n = (n >> 1);
              }
              
              else
              {
                  return count + 1 ;
              }
          }
          return -1 ;
            
    }
}


