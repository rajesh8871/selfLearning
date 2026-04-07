package recurssion;

public class Palindrome {
    public static void main(String[] args) {
        int number = 12321;

        System.out.println(palindrome(Integer.toString(number), 0, String.valueOf(number).length() - 1));
    }

    private static boolean palindrome(String number, int start, int end) {

        if (start >= end) {
            return true;
        }
        return number.charAt(start) == number.charAt(end) && palindrome(number, start + 1, end - 1);
    }
}
