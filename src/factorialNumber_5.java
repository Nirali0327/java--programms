import java.util.Scanner;
//The factorial of a number is the product of all the integers from 1 to that number. For example, the factorial of 6 is 1*2*3*4*5*6 = 720
public class factorialNumber_5 {
    public static void main(String[] args) {
        int number;
        int factorial =1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number");
        number = input.nextInt();
        for (int a = number; a > 0; a--) { // a = 5
            factorial = factorial   *  a;
        }
        System.out.println("Factorial Number of " + number + " is :  "   + factorial);
    }
}