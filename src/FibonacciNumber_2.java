import java.util.Scanner;

public class FibonacciNumber_2 {
    public static void main(String[] args) {
        int num1=0,num2 =0,num3 =1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limitation of n: ");
        int number = scanner.nextInt();
        System.out.print("Fibonacci series:  ");
        for(int i = 1;i < number;i++){
              num1=num2;
              num2=num3;
             num3 = num1 + num2;
            System.out.print(num1+ "   ");


        }
    }
}