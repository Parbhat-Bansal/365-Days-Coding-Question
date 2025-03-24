
//Question Link :- https://www.geeksforgeeks.org/problems/make-binary-tree/1?page=1&category=Linked%20List&status=solved&sortBy=submissions

class Solution {
    public TreeNode linkedListToBinaryTree(Node head) {
        // code here
        if (head == null) 
        {
            return null;
        }
        
        // Create the root node
        TreeNode root = new TreeNode(head.data);
        head = head.next;
        
        TreeNode current = root;
        while (head != null) 
        {
            current.left = new TreeNode(head.data);
            current = current.left;
            head = head.next;
        }
        
        return root;
    }
    
}