public class div{
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 2;

        if (denominator != 0) {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
