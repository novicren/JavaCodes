import java.util.Scanner;

// A calculator that runs continuously and does not crash when a user types a letter instead of a number.

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double operand1;
        double operand2;
        char operator;
        double result = 0;
        boolean isValidOperator = true;

        while (true) {
            System.out.print("Enter first number: ");
            operand1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            operand2 = scanner.nextDouble();

            switch (operator) {
                case '+' -> result = operand1 + operand2;
                case '-' -> result = operand1 - operand2;
                case '*' -> result = operand1 * operand2;
                case '/' -> {
                    if (operand2 == 0) {
                        System.out.println("Cannot divide by zero");
                        isValidOperator = false;
                    } else {
                        result = operand1 / operand2;
                    }
                }
                default -> {
                    if (isValidOperator) {
                        System.out.println("Invalid input");
                        isValidOperator = false;
                    }
                }
            }

            if (isValidOperator) {
                System.out.println(result);
            }
        }

    }
}
