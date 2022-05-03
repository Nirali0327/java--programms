import java.util.Scanner;
public class PrimeNumber_3
{
    //A number that is divisible only by itself and 1 so A number that is exactly  has 2  factors so  itself and 3(1,3)
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int value =0;
        for(int i = 1;i <= num; i++)
            {
             if (num % i == 0 )
            {
               value = value + 1;  // increase interger value
            }
            }
             if (value == 2)    //
        {
               System.out.println(  " It is a  prime number " );
        }    else

             {
               System.out.println(  " It is not a prime number ");
             }
    }
}
