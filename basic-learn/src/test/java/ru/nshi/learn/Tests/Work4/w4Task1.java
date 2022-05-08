package ru.nshi.learn.Tests.Work4;
import java.util.Scanner;

public class w4Task1
{
    public static void main(String[] args)
    {
        w4Task1 application = new w4Task1();
        Scanner sr = new Scanner(System.in);
        String text=sr.next();

        String[] array= new String[text.length()];
        application.sorting(text, array);
        application.printArray(array);
    }
    public void sorting(String text, String[] array)
    {
        for (int k=0 ; k < text.length();k++)
        {
            for(int i=0;i<k;i ++)
            {
                System.out.print(text.charAt(i));
                array[i]+=text.charAt(i);
            }

            System.out.println("\n");
        }
    }
    public  void printArray(String[] array)
    {
        for (int i=0; i <array.length; i++)
        {
            System.out.print(array[i]+", ");
        }
    }
}
