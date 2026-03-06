import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray()) {
            stack.push(c);
        }

        for(char c : str.toCharArray()) {
            if(c != stack.pop())
                return false;
        }

        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String str) {

        Deque<Character> deque = new LinkedList<>();

        for(char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }
}

class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String str) {
        return strategy.checkPalindrome(str);
    }
}

public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";

        PalindromeChecker checker = new PalindromeChecker(new StackStrategy());


        if(checker.check(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}