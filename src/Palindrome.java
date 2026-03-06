import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {

        String str = "madam";
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reverse = "";

        while(!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        if(str.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}