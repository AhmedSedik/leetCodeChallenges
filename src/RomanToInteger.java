import java.util.Arrays;
import java.util.Scanner;

public class RomanToInteger {
    public static boolean isRoman = false;
    public static void main(String[] args) {
        System.out.println("Enter The Number in Roman: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Integer: " + romanToInt(input));
    }
    static int romanToInt(String input) {
        int sum = 0, number = 0;

        if (input != null) {
            for (int i = 0; i < input.length(); i++) {
                String[] romanCharacters = {"I", "V", "X", "L", "C", "D", "M"};
                String character = String.valueOf(input.charAt(i));
                isRoman = Arrays.asList(romanCharacters).containsAll(Arrays.asList(character));
                if (isRoman) {
                    switch (character) {
                        case "I":
                            number = 1;
                            break;
                        case "V":
                            number = 5;
                            break;
                        case "X":
                            number = 10;
                            break;
                        case "L":
                            number = 50;
                            break;
                        case "C":
                            number = 100;
                            break;
                        case "D":
                            number = 500;
                            break;
                        case "M":
                            number = 1000;
                            break;
                    }
                    if (i + 1 < input.length()) {
                        if ((input.charAt(i) == 'I' && input.charAt(i + 1) == 'V') || (input.charAt(i) == 'I' && input.charAt(i + 1) == 'X')
                                || (input.charAt(i) == 'X' && input.charAt(i + 1) == 'L') || (input.charAt(i) == 'X' && input.charAt(i + 1) == 'C')
                                || (input.charAt(i) == 'C' && input.charAt(i + 1) == 'D') || (input.charAt(i) == 'C' && input.charAt(i + 1) == 'M')) {
                            sum -= number;

                        } else sum += number;
                    } else sum += number;

                }
            }//TODO handle incompatible character and the IIII
        }
        return sum;
    }
}
