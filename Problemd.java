/*Adam number. */
import java.util.Scanner;

public class Problemd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        // Reverse a number
        int reversedNum = 0, temp = num;
        while (temp > 0) {
            reversedNum = reversedNum * 10 + temp % 10;
            temp /= 10;
        }

        // Calculate squares
        int squareOriginal = num * num;
        System.out.println(squareOriginal);
        int squareReversed = reversedNum * reversedNum;
        System.out.println(squareReversed);

        // Reverse the square of the original number
        int reversedSquareOriginal = 0, tempSquare = squareOriginal;
        while (tempSquare > 0) {
            reversedSquareOriginal = reversedSquareOriginal * 10 + tempSquare % 10;
            tempSquare /= 10;
            
        }
       
        // Check if squares are reverse of each other
        if (reversedSquareOriginal == squareReversed) {
            System.out.println(num + " is an Adam number.");
        } else {
            System.out.println(num + " is not an Adam number.");
        }
    }
}
