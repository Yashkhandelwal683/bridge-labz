import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Multiply the numbers
        int product = num1 * num2;

        // Print result
        System.out.println("Multiplication result: " + product);
    }
}
