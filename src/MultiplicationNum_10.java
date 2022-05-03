import java.util.Scanner;

public class  MultiplicationNum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        for (int i =1; i <= 12;i++){
            System.out.println(number+ " * " + i +" =  "+number *i);

        }

    }
}
