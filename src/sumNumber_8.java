import java.util.Scanner;

public class sumNumber_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int sum = scanner.nextInt();
        for(int a =1; a<=20;a++){
            {
                sum = sum + a;  // it will add up the user number plus the whole loop number from 1 to 20 one by one
            }
            System.out.print(sum + "  ");

        }
    }
}
