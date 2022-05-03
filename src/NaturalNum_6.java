import java.util.Scanner;
//The positive numbers 1, 2, 3... are known as natural numbers and its sum is the result of all numbers starting from 1 to the given number.e.g = 1+2+3 = 6, so 6 is natural number of 3
public class NaturalNum_6
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int num = input.nextInt();
        int sum =0;
        for(int i = 1;i<=num;++i){
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
}
