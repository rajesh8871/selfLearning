package recurssion;

public class CountZero {
    public static void main(String[] args) {
        int number = 1203210;
        int count = 0;
        System.out.println(countZero(number,count));
    }

    public static int countZero(int number, int count) {
        if (number % 10 == number) {
            return count;
        }

        if (number % 10 == 0) {
            count++;
        }
      return   countZero(number/10, count);

    }
}
