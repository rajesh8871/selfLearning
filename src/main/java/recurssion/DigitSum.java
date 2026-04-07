package recurssion;

public class DigitSum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));

    }

    public static int sum(int number) {
        if (number %10 == number) {
            return number;
        }
        return sum(number / 10) + number % 10;
    }
}
