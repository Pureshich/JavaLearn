package Work2;

import java.util.Random;

public class Task1
{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        FillArray(array);
    }
    public static void FillArray(int[] array)
    {
        Random rnd = new Random();
        for (int i=0; i <array.length; i++)
        {
            array[i] = rnd.nextInt(100-10)+10;
        }
        PrintArray(array);
    }
    public  static void PrintArray(int[] array)
    {
        for (int i=0; i <array.length; i++)
        {
            System.out.print(array[i]);
        }
    }
}
