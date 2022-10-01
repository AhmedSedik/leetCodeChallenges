import java.util.Scanner;

public class ReduceStepsToZero {
    private static final double UPPER_LIMIT = Math.pow(10, 6);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numer of Steps = " + calculateNumOfSteps(scanner.nextInt()));
    }

    public static int calculateNumOfSteps(int num) {
        int count=0;
        while (num != 0 && num <= UPPER_LIMIT) {
            if (num % 2 == 0) {
                num /= 2;
                System.out.println("Number is Even divide by 2 obtain " + num);

            } else {
                num -= 1;
                System.out.println("Number is odd subtract 1 obtain " + num);
            }
            count++;
        }

        return count;
    }
}
