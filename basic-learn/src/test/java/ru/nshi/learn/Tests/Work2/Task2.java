package ru.nshi.learn.Tests.Work2;

import java.util.Random;

public class Task2
{
    public static void main(String[] args)
    {
        Task2 application = new Task2();
        int[] array = new int[5];
        application.FillArray(array);
        application.Sum(array);
        application.PrintArray(array);
    }
    public  int[] FillArray(int[] array)
    {
        Random rnd = new Random();
        for (int i=0; i <array.length; i++)
        {
            array[i] = rnd.nextInt(101)-50;
            //System.out.print(array[i]+", ");
        }
        return  array;
    }
    public  void PrintArray(int[] array)
    {
        for (int i=0; i <array.length; i++)
        {
            System.out.print(array[i]+", ");
        }
    }

    public int Sum(int[] array)
    {
        int sum=0;
        for (int i = 0;i < array.length;i++)
        {
            if(array[i]>0)
            {
                sum += array[i];
            }
        }
        System.out.println("Сумма всех положительный значений: "+sum);
        return sum;
    }
}
