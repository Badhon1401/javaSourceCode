package JavaSourceCode;

import java.util.Scanner;

public class MultipleExceptionsExample {
    @SuppressWarnings("null")
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine());
            int result = 10 / num;
            System.out.println("Result: " + result);
            String str = null;
            System.out.println(str.length());  // This line will throw a NullPointerException
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
