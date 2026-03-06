public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";   // hardcoded string
        String reverse = "";

        // reverse the string
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // check palindrome
        if(str.equals(reverse)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is not a Palindrome");
        }

    }
}