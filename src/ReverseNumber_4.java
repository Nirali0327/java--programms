import java.util.Scanner;

public class ReverseNumber_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the highest number  ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the lower  number  ");
        int number2 = scanner.nextInt();
       System.out.println(" List of input number " +number1+ " to  " + number2);
          for(int value = number1; value >=number2;value--)
        {
            System.out.print(value + "     ");
        }
          if (number2<=number1)
          {

          }
    }
}
