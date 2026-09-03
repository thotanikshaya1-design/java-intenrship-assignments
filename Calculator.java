import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Basic Calculator =====");

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n===== Results =====");

        // Addition
        System.out.println("Addition: " + (num1 + num2));

        // Subtraction
        System.out.println("Subtraction: " + (num1 - num2));

        // Multiplication
        System.out.println("Multiplication: " + (num1 * num2));

        // Division
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        scanner.close();
    }
}
