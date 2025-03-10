//Question Link:- https://www.geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/union-of-two-sorted-arrays-1587115621
class Solution {
    public static ArrayList<Integer> FUnion(int[] a, int[] b) 
    {
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;
        int m = a.length, n = b.length;

        while (i < m && j < n)  
        {
            if (i > 0 && a[i] == a[i - 1]) 
            {
                i++;
                continue;
            }

            if (j > 0 && b[j] == b[j - 1])
            {
                j++;
                continue;
            }

            if (a[i] < b[j]) 
            {
                unionList.add(a[i++]);
            } 
            
            else if (a[i] > b[j]) 
            {
                unionList.add(b[j++]);
            } 
            
            else 
            { 
                unionList.add(a[i]);
                i++;
                j++;
            }
        }

        while (i < m) 
        {
            if (a[i] != a[i - 1]) 
            {
                unionList.add(a[i]);
            }
            i++;
        }


        while (j < n) {
            if (b[j] != b[j - 1]) 
            {
                unionList.add(b[j]);
            }
            j++;
        }

        return unionList;
    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> result= new ArrayList<>();
        result = FUnion(a , b);
        return result ;
    }
}
