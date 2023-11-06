import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerLimit = 0;
        int divisor = 0;

        try {
            System.out.println("Enter the value for lowerLimit:");
            lowerLimit = scanner.nextInt();

            if (lowerLimit < 0) {
                throw new Exception("Lower limit cannot be a negative number.");
            }

            System.out.println("Enter the value for divisor:");
            divisor = scanner.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            System.out.println("Entering the try block");
            int result = lowerLimit / divisor;

            if (lowerLimit < 100) {
                throw new Exception("Lower limit violation");
            }
            System.out.println("Exiting the try block");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("After catch block");
        scanner.close();
    }
}



// Enter the value for lowerLimit:
// -5
// Exception: Lower limit cannot be a negative number.
// After catch block
