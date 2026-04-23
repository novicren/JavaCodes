import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character] f - float, double | d - int | c - char | s - String
        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding
/*
        double num1 = 9.99;
        double num2 = 100.15;
        double num3 = -54.01;

        System.out.printf("% .2f\n", num1);
        System.out.printf("% .2f\n", num2);
        System.out.printf("% .2f\n", num3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7891;
        String name = "tiku";

        System.out.printf("%5d\n", id1);
        System.out.printf("%5d\n", id2);
        System.out.printf("%5d\n", id3);
        System.out.printf("%5d\n", id4);

        String name = "aman";
        char letter = name.charAt(0);
        System.out.println(name.length() + "\n" + letter);
        System.out.println(name.toUpperCase());

        String email = "aman@gmail.com";
        int addressSign = email.indexOf("@");
        String subName = email.substring(0, addressSign);
        String domain = email.substring(addressSign + 1);
        System.out.printf("name: %s | domain: %s", subName, domain);

        // ternary operator ? = return 1 or 2 value if a condition is true

        // variable = (condition) ? "ifTrue" : "ifFalse";

        int number = 1;

        String evenOrOdd = (number % 2 == 0) ? "even" : "odd";
        System.out.println(evenOrOdd);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        String unit = scanner.next();

        double newTemp = (unit.equalsIgnoreCase("C") ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32);

        System.out.printf("%.1f°%s", newTemp, unit);

        scanner.close();

        String day = "Monday";

        switch(day) {
            case "Monday", "Tuesday", "Wednesday" -> System.out.println("Weekday");

        }

 */
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char symbol;

        System.out.print("rows: ");
        rows = scanner.nextInt();

        System.out.print("columns: ");
        columns = scanner.nextInt();

        System.out.print("Symbol: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
