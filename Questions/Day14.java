

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
//Question Link :- https://www.geeksforgeeks.org/problems/inorder-traversal/1?page=2&category=Tree&sortBy=submissions
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> result = new ArrayList<>() ;
        Inorder(root , result);
        return result ;
    }
    
    public void Inorder(Node root , ArrayList<Integer>result)
    {
        if(root != null)
        {
            Inorder(root.left , result);
            result.add(root.data);
            Inorder(root.right , result);
        }
    }
}