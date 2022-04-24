package ru.nshi.learn.Tests.Work2;

import java.util.Random;

public class Task1
{
    public static void main(String[] args)
    {
        Task1 application = new Task1();
        int[] array = new int[5];
        application.fillArray(array);
        application.printArray(array);
    }
    public  int[] fillArray(int[] array)
    {
        Random rnd = new Random();
        for (int i=0; i <array.length; i++)
        {
            array[i] = rnd.nextInt(90)+10;
        }
        return array;
    }
    public  void printArray(int[] array)
    {
        for (int i=0; i <array.length; i++)
        {
            System.out.print(array[i]+", ");
        }
    }
}
