package Exception;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    // 1. Checked exception using throws
    static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        file.close();
        System.out.println("File read successfully");
    }

    // 2. throw keyword
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(
                    "Age must be 18 or above"
            );
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        // Checked Exception
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(
                    "Checked Exception: " + e.getMessage()
            );
        } finally {
            System.out.println("File operation completed");
        }

        // Unchecked Exception
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(
                    "Unchecked Exception: " + e.getMessage()
            );
        } finally {
            System.out.println("Division operation completed");
        }

        // throw and exception handling
        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Exception handled: " + e.getMessage()
            );
        } finally {
            System.out.println("Age verification completed");
        }

        System.out.println("Program continues normally");
    }
}