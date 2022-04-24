package ru.nshi.learn.Tests.Work4;
import java.util.Scanner;

public class w4Task1
{
    public static void main(String[] args)
    {
        w4Task1 application = new w4Task1();
        Scanner sr = new Scanner(System.in);
        String text=sr.next();
        application.sorting(text);
    }
    public void sorting(String text)
    {
        int num=0;
        while (num <= text.length())
        {
            for(int i=0;i<num;i ++)
            {
                System.out.print(text.charAt(i));
            }
            System.out.println("\n");
            num++;
        }
    }
}
