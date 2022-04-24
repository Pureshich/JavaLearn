package ru.nshi.learn.Tests.Work4;

import java.util.Scanner;

public class w4Task2
{
    public static void main(String[] args)
    {
        w4Task2 application = new w4Task2();
        Scanner sr = new Scanner(System.in);
        String text=sr.next();
        application.sorting(text);
    }
    public String sorting(String text)
    {
        String outText="";
            for(int i=0;i<text.length();i ++)
            {
                if(Character.isUpperCase(text.charAt(i)))
                {
                    outText+=text.charAt(i);
                    //System.out.print(text.charAt(i));
                }
            }
            return outText;
    }
}
