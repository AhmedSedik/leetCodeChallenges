import java.util.Scanner;

public class CountOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Result: " + countOperations(num1, num2));



    }
    static int  countOperations(int num1, int num2) {
        int count=0;
        while (num1 != 0 && num2 != 0) {
            if (num1>=num2) num1 -= num2;
            else num2 -= num1;
            count++;
        }
        return count;
    }

}
