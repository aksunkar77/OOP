package pr5.io.app;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SafeDivider {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			while (true) {
			    try {
			        System.out.print("Enter first integer: ");
			        int x1 = scan.nextInt();

			        System.out.print("Enter second integer: ");
			        int x2 = scan.nextInt();

			        int result = x1 / x2;
			        System.out.println("Result: " + result);

			    } catch (ArithmeticException e) {
			        System.out.println("Error: Division by zero is not allowed.");
			    } catch (InputMismatchException e) {
			        System.out.println("Error: Please enter valid integers.");
			        scan.nextLine(); 
			    }
			}
		}
    }
}