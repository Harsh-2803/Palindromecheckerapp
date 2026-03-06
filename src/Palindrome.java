import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
            stack.push(str.charAt(i));
        }

        boolean isPalindrome = true;

        while(!queue.isEmpty()) {
            if(queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is not a Palindrome");
    }
}