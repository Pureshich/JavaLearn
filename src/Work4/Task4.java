package Work4;

import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        String text=sr.next();
        sorting(text);
    }
    public  static void sorting(String text)
    {
        int sum=0;
        for(int i=0;i<text.length();i ++)
        {
            if(Character.isDigit(text.charAt(i)))
            {
                sum+=Integer.parseInt(String.valueOf(text.charAt(i)));
            }
        }
        System.out.print(sum);
    }
}
