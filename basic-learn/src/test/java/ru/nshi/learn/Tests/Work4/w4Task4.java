package ru.nshi.learn.Tests.Work4;

import java.util.Scanner;

public class w4Task4
{
    public static void main(String[] args)
    {
        w4Task4 application = new w4Task4();
        Scanner sr = new Scanner(System.in);
        String text=sr.next();
        application.sorting(text);
    }
    public int sorting(String text)
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
        return sum;
    }
}
