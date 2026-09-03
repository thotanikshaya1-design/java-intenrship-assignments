import java.util.Scanner;

public class GradeEvaluation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Grade Evaluation Program =====");

        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter marks between 0 and 100.");

        } else if (marks >= 80) {
            System.out.println("Grade: A");

        } else if (marks >= 60) {
            System.out.println("Grade: B");

        } else if (marks >= 40) {
            System.out.println("Grade: C");

        } else {
            System.out.println("Grade: Fail");
        }

        scanner.close();
    }
}

