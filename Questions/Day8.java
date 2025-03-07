//Question Link ;-https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1?page=5&sortBy=submissions

class Solution {
    // Function to reverse a linked list and return the new head
    public Node reverseList(Node head) 
    {
        Node prev = null, curr = head, next = null;
        while (curr != null) 
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; 
    }

    public Node addOne(Node head) 
    {
        head = reverseList(head);
        Node temp = head;
        int carry = 1;
        
        while (temp != null) 
        {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;
            
            if (carry == 0)
            {
                break;
            }
            
            
            if (temp.next == null && carry == 1) 
            {
                temp.next = new Node(1);
                carry = 0;
            }
            temp = temp.next;
        }

        return reverseList(head);
    }
}
