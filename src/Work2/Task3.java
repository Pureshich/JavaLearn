package Work2;

import java.util.Random;
public class Task3
{
    public static void main(String[] args)
    {
        Task3 application = new Task3();
        int[] array = new int[5];
        application.fillArray(array);
        application.searchMaxIntInArray(array);
        application.searchMinIntArray(array);
        application.PrintArray(array);
    }
    public int[] fillArray(int[] array)
    {
        Random rnd = new Random();
        for (int i=0; i <array.length; i++)
        {
            array[i] = rnd.nextInt(100-10)-10;
        }
        return array;
    }
    public void PrintArray(int[] array)
    {
        for (int i=0; i <array.length; i++)
        {
            System.out.print(array[i]+", ");
        }
    }

    public void searchMaxIntInArray(int[] array)
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
    public void searchMinIntArray(int[] array)
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
