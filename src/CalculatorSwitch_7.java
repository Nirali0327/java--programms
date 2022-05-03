import java.util.Scanner;

public class CalculatorSwitch_7 {
    public static void main(String[] args) {
        char operator;
        double num1;
        double num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operator");
        operator = scanner.next().charAt(0);
        System.out.println("Enter the first  number");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        num2 = scanner.nextInt();
        switch (operator) {
            case '+':
                System.out.println("Addition is " + (num1 + num2));
                break;
            case '-':
                System.out.println("subtraction is " + (num1 - num2));
                break;
            case '*':
                System.out.println("multiplication is " + (num1 * num2));
                break;
            case '/':
                System.out.println("division is " + num1 / num2);
            default:
                System.out.println("Invalid input");

        }

    }
}

