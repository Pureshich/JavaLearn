package ru.nshi.learn.Tests.Work4;

import java.util.Arrays;
import java.util.Scanner;

public class w4Task3
{
    public static void main(String[] args)
    {
        w4Task3 application = new w4Task3();
        Scanner sr = new Scanner(System.in);
        String text=sr.next();
        application.scanning(text);
        int num;
        num=scanning(text);//присваиваем к значению num переменную count
        char[] array = new char[num];//создаем массив длиной num
        application.sorting(text,array);
    }

    public static int scanning(String text)
    {
        int count=0;
        for(int i=0;i<text.length();i ++)
        {
            if (Character.isDigit(text.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
    public char[] sorting(String text, char[] array)
    {
        int g=0;
        for(int i=0;i<text.length();i ++)
        {
            if (Character.isDigit(text.charAt(i)))
            {
                array[g] = text.charAt(i);
                g += 1;
            }
        }

        System.out.println(Arrays.toString(array));
        return array;
    }
}
