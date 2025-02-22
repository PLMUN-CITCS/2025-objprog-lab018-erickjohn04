import java.util.Scanner;

public class EvenOddChecker {

    // Method to get the integer input from the user
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }

    // Method to check if the number is even or odd
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    public static void main(String[] args) {
        // Get the integer input from the user
        int number = getInput();
        
        // Check if the number is even or odd
        checkEvenOdd(number);
    }
}
