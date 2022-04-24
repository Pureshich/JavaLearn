package ru.nshi.learn.Tests.Work4;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class w4Task5
{
    public static void main(String[] args)
    {
        w4Task5 application = new w4Task5();
        Scanner sr = new Scanner(System.in);
        String text;
        text = sr.next();

        application.sorting(text);
    }
    public String  sorting(@NotNull String text)
    {
        String wishlist=" ";
        String result="";
        boolean ok=true;
        for(int i=0;i<text.length();i++)
        {
            for(int j=0;j<wishlist.length();j++)
            {
                if(text.charAt(i)!=wishlist.charAt(j))
                {
                    ok = true;
                }
                else
                {
                    ok=false;
                    break;
                }
            }
            if(ok == true)
            {
                result += text.charAt(i);
                wishlist+=text.charAt(i);
            }
        }
        System.out.println(result);
        return result;
    }
}
