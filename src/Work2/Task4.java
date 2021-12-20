package Work2;

import java.util.Random;

public class Task4
{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        int maxInt=0;
        int minInt=100;
        FillArray(array);
        PrintArray(array);//выодим изначальный массив(для проверки)
        SeachMaxMinIntInArray(array, maxInt, minInt);

    }
    public static void FillArray(int[] array)
    {
        Random rnd = new Random();
        for (int i=0; i <array.length; i++)
        {
            array[i] = rnd.nextInt(100-10)-10;
        }
    }
    public  static void PrintArray(int[] array)
    {
        for (int i=0; i <array.length; i++)
        {
            System.out.print(array[i]+", ");

        }
        System.out.println("");
    }
    public static  void SeachMaxMinIntInArray(int[] array, int maxInt, int minInt)//сразу высчитываем максимально и минимальное знач. + записыавем их номера
    {
        int MinIinArray = 0;//номер где стоит минимальное число в массиве
        int MaxIinArray = 0;//номер где стоит максимальное число в массиве
        for (int i = 0;i < array.length;i++)
        {
            if(array[i]>maxInt)
            {
                MaxIinArray = i;
                maxInt=array[i];

            }
        }
        System.out.println("максимальное число: "+ maxInt);

        for (int b = 0;b < array.length;b++)
        {
            if(array[b]<minInt)
            {
                minInt = array[b];
                MinIinArray = b;
            }
        }
        System.out.println("минимальное число: "+ minInt);

        Change(MaxIinArray,MinIinArray,array,maxInt,minInt);
    }
    public static void Change(int MaxIinArray, int MinIinArray,int[] array,int maxInt,int minInt)//меняем местами
    {
        array[MinIinArray] = maxInt;
        array[MaxIinArray] = minInt;
        PrintArray(array);// выводим уже измененный массив
    }
}
