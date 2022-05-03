import java.util.Scanner;

public class String_11 {
   //	WAP to enter any String and count total number of 'a' in that String.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the String");
        String result = scanner.next();
        int value = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == ' ') ;
            value++;
        }
           System.out.println(" total character " + value);
    }
   }
