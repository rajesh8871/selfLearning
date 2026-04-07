package recurssion;

public class NumberOfSteps {
    public static void main(String[] args) {
        int number =14;
        // if the current number is even divide by 2 else subtract -1 from the number
        int steps = 0;
        int numberOfSteps = numberSteps(number, steps);
        System.out.println(numberOfSteps);
    }

    private static int numberSteps(int number, int steps) {

        if (number == 0) {
            return steps;
        }
        return numberSteps((number % 2 == 0) ? number / 2 : number - 1, steps + 1);

    }
}
