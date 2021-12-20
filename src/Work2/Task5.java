package Work2;

import java.util.Random;

public class Task5
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

    public static  void SeachMaxMinIntInArray(int[] array, int maxInt, int minInt)//сразу выщитываем максимально и минимальное знач. + записыавем их номера
    {
        int MinIinArray = 0;//номер где стоит минимальное число в массиве
        int MaxIinArray = 0;//номер где стоит максимальное число в массиве
        for (int i = 0;i < array.length;i++)
        {
            if(array[i]>maxInt)
            {
                maxInt=array[i];
                MaxIinArray = i;
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

        Average(MaxIinArray,MinIinArray,array, minInt,maxInt);
    }
    public static void Average(int MaxIinArray, int MinIinArray,int[] array,int minInt, int maxInt)
    {
        int sum = 0;//сумма чисел между максимальным и минимальным(или наоборот)
        int count=0;//счетчик количества этих чисел

        if( MaxIinArray> MinIinArray)//если максимальное число стоит правее минимального
        {
            for(int i=MaxIinArray-1; i>MinIinArray;i--)//-1 -не берем в расчет само максимальное число
            {
                sum +=array[i];
                count++;
            }
        }
        if( MaxIinArray< MinIinArray)//если максимальное число стоит левее минимального
        {
            for(int i=MinIinArray; i<MaxIinArray;i--)
            {
                sum +=array[i];
                count++;
            }
        }
        if(sum != 0)//проверяем сумму чтоб не делить на ноль
        {
            System.out.println("Средние арфимитическое промежутка = "+ sum/count);
        }
        else
        {
            System.out.println("в промежутке между "+maxInt +"и "+minInt+"чисел нет");
        }
    }
}
