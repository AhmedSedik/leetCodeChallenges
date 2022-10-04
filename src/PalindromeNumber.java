/*
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = scanner.nextInt();
        System.out.println(isPalindrome(x));







        }



    static boolean isPalindrome(int x) {
        int input = Math.abs(x);
        int temp, sum = 0;
        while (x > 0) {
            // mod will always give back last integer
            temp = x % 10;
            sum = sum * 10 + temp;
            x = x / 10;
        }
        if (input == sum) {
//            System.out.println("true");
//            System.out.printf("%d reads as %d from left to right and from right to left.\nnumber is palindrome", input, sum);
            return true;
        } else {
            return false;
        }

    }

}
*/
