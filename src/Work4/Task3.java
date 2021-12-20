package Work4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        String text=sr.next();
        sorting(text);
    }
    public  static void sorting(String text)
    {
        int g=0;
        char[] array=new char[text.length()];
        for(int i=0;i<text.length();i ++)
        {
            if (Character.isDigit(text.charAt(i)))
            {
                array[g] = text.charAt(i);
                g += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
