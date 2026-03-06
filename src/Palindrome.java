public class Palindrome {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(String str) {

        Node head = new Node(str.charAt(0));
        Node current = head;

        for(int i = 1; i < str.length(); i++) {
            current.next = new Node(str.charAt(i));
            current = current.next;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node next;

        while(slow != null) {
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        Node first = head;
        Node second = prev;

        while(second != null) {
            if(first.data != second.data)
                return false;

            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        if(isPalindrome(str))
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is not a Palindrome");
    }
}