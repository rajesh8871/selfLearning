package recurssion;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(reverse(number));
    }

    static int reverse(int number) {
        if (number % 10== number) {
            return number;
        }
        String rev = Integer.toString(number % 10) + reverse(number / 10);
        return Integer.parseInt(rev);
    }
}
