//Question Link :- https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?page=2&status=solved&sortBy=submissions


class Solution {
    public int kthElement(int a[], int b[], int target) 
    {
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0, count = 0;
        int ans = -1;

        // Merge process to find the `target`-th element
        while (i < n && j < m) {
            int val;
            if (a[i] < b[j]) {
                val = a[i];
                i++;
            } else {
                val = b[j];
                j++;
            }

            count++;
            if (count == target) {
                return val;
            }
        }

        // If elements remain in array `a`
        while (i < n) {
            count++;
            if (count == target) {
                return a[i];
            }
            i++;
        }

        // If elements remain in array `b`
        while (j < m) {
            count++;
            if (count == target) {
                return b[j];
            }
            j++;
        }

        return ans;
    }
}
