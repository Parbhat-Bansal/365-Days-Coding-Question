

//Question Link :- https://www.geeksforgeeks.org/problems/check-for-balanced-tree/1?page=2&status=solved&sortBy=submissions

class Solution {
    private int checkHeight(Node root) 
    {
        if (root == null) 
        {
            return 0;
        }

        int lh = checkHeight(root.left);
        if (lh == -1) 
        {
            return -1;
        }

        int rh = checkHeight(root.right);
        if (rh == -1) 
        {
            return -1;
        }

        if (Math.abs(lh - rh) > 1) 
        {
            return -1;
        }

        return Math.max(lh, rh) + 1;
    }

    public boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }
}

