package Work2;

import java.util.Random;
public class Task3
{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        FillArray(array);
        SeachMaxIntInArray(array);
        SeachMinIntArray(array);
        PrintArray(array);
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
    }

    public static  void SeachMaxIntInArray(int[] array)
    {
        int maxInt = array[0];
        for (int i = 0;i < array.length;i++)
        {
            if(array[i]>maxInt)
            {
                maxInt=array[i];
            }
        }
        System.out.println("максимальное число: "+ maxInt);
    }
    public static void SeachMinIntArray(int[] array)
    {
        int minInt = array[0];
        for (int i = 0;i < array.length;i++)
        {
            if(array[i]<minInt)
            {
                minInt=array[i];
            }
        }
        System.out.println("минимальное число: "+ minInt);
    }
}
