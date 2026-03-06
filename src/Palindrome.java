public class Palindrome {

    public static void main(String[] args) {

        String str = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        boolean isPalindrome = true;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome)
            System.out.println("The string is a Palindrome");
        else
            System.out.println("The string is not a Palindrome");
    }
}