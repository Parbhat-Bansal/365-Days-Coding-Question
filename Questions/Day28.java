

//Question Limk :- https://www.geeksforgeeks.org/problems/children-sum-parent/1?page=3&status=solved&sortBy=submissions

class Solution {
    // Function to check whether all nodes of a tree have the value 
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
        if (root == null) 
        {
            return 1; 
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) 
        {
            Node curr = q.poll();
            
            int sum = 0;
            if (curr.left != null) 
            {
                sum += curr.left.data;
                q.add(curr.left);
            }
            if (curr.right != null) 
            {
                sum += curr.right.data;
                q.add(curr.right);
            }

            if (sum != curr.data && (curr.left != null || curr.right != null)) 
            {
                return 0;
            }
        }

        return 1; 
    }
}