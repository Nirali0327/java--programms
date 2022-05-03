import java.util.Scanner;

public class MinMaxNumber_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any three  numbers");
        int num1 = scanner.nextInt();  // first number from user
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = num1;
        int min = num2;
         if (num2 > max)
          {
            max = num2;
           }
          else if
             (num2 < min)
            {
              min = num2;
             }

              if (num3 > max)
              {
                max = num3;
               }
                else if (num3 < min)
                {
                    min = num3;
                }
                System.out.println("Maximum number is " + max);
                System.out.println("minimum number is " + min);
                }

    }







