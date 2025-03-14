

//Question Link:- https://www.geeksforgeeks.org/problems/preorder-traversal/1?page=1&category=Tree&status=solved&sortBy=submissions

class Solution {
    static ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    
    static void preorder(Node root, ArrayList<Integer> result) {
        if (root != null) 
        {
            result.add(root.data);
            preorder(root.left, result);
            preorder(root.right, result);
        }
    }
}