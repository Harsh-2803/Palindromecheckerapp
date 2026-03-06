import java.util.Stack;

public class Palindrome {

    public static boolean twoPointer(String str) {
        int start = 0;
        int end = str.length() - 1;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackMethod(String str) {

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

    public static boolean reverseMethod(String str) {

        String rev = "";

        for(int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return str.equals(rev);
    }

    public static void main(String[] args) {

        String str = "madam";

        long startTime, endTime;

        startTime = System.nanoTime();
        twoPointer(str);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        stackMethod(str);
        endTime = System.nanoTime();
        System.out.println("Stack Method Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        reverseMethod(str);
        endTime = System.nanoTime();
        System.out.println("Reverse Method Time: " + (endTime - startTime) + " ns");
    }
}