public class String_11 {
     //	WAP to enter any String and count total number of 'a' in that String.
    public static void main(String args[])
    {
        int c = 0;
        String St = "'I always like to eat chocolate cakes and chocolate ice cream'";
        char letter = 'a';
        for (int i = 0; i < St.length(); i++)
        {
            if (St.charAt(i) == letter) // ---- inbuilt St.charAt(i) method to count character in string'.
                c++;
        }

        System.out.println("Total number of "+letter+ " is " + c + "  in String  " + St);
        }
}