import java.util.Scanner;

class CreateAccount {
    static String firstname;
    static String lastname;
    static int age;
    static Scanner sc = new Scanner(System.in);

    public static void getInfo() {
        System.out.print("Enter first name: ");
        firstname = sc.next();
        System.out.print("Enter last name: ");
        lastname = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public static void displayInfo() {
        System.out.println();
    }
}

public class BankSystem {
    public static void main(String[] args) {
        CreateAccount.getInfo();
    }
}
