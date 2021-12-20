package Work4;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        String text=sr.next();
        sorting(text);
    }
    public  static void sorting(String text)
    {
            for(int i=0;i<text.length();i ++)
            {
                if(Character.isUpperCase(text.charAt(i)))
                {
                    System.out.print(text.charAt(i));
                }
            }
            System.out.println("\n");
    }
}
