package Work2;

import java.util.Random;

public class Task2
{
    public static void main(String[] args)
    {
        int[] array = new int[5];
        FillArray(array);
        Sum(array);
        PrintArray(array);
    }
    public static void FillArray(int[] array)
    {
        Random rnd = new Random();
        for (int i=0; i <array.length; i++)
        {
            array[i] = rnd.nextInt(101)-50;
            //System.out.print(array[i]+", ");

        }
    }
    public  static void PrintArray(int[] array)
    {
        for (int i=0; i <array.length; i++)
        {
            System.out.print(array[i]+", ");
        }
    }

    public static  void Sum(int[] array)
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
    }
}
