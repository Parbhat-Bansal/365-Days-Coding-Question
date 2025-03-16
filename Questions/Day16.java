
//Question Link :-https://www.geeksforgeeks.org/problems/postorder-traversal/1?page=1&category=Tree&status=solved&sortBy=submissions

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        postorder(root, result); 
        return result;
    }

    // Helper method for recursion
    static void postorder(Node root, ArrayList<Integer> result) {
        if (root != null) { // Use "null" instead of "NULL"
            postorder(root.left, result);
            postorder(root.right, result);
            result.add(root.data);
        }
    }
}
