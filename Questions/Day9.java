//Question Link :- https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1?page=1&category=Linked%20List&sortBy=submissions
class Solution {
    // Function to check whether the list is palindrome.
    static boolean isPalindrome(Node head) {
        // Your code here
       if (head == null || head.next == null) 
       {
        return true; 
       }

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverseList(slow);

        Node firstHalf = head, temp = secondHalf;
        while (temp != null) 
        {
            if (firstHalf.data != temp.data) 
            {
                return false;
            }
        firstHalf = firstHalf.next;
        temp = temp.next;
        }   

    return true;
}


    static Node reverseList(Node head) 
    {
        Node prev = null;
        while (head != null) 
        {
            Node nextNode = head.next; 
            head.next = prev; 
            prev = head; 
            head = nextNode; 
        }
        return prev; 
    }
}