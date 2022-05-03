import java.util.Scanner;
// print number 23 to 33
public class PrintNumber_1
{ public static void main(String[] args)
    {    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
         int a  = scanner.nextInt();
         for (a=23; a<=33;a++)
         {
            System.out.println(a);
         }
    }
}


