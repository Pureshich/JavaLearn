package Work3;

import java.util.Arrays;
import java.util.Random;

public class Task2
{
    public static void main(String[] args)
    {
        int[][] array = new int[10][10];
        FillArray(array);
        System.out.println("Наш массив:");
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
        SumBollard(array);
    }
    public  static void  FillArray(int[][] array)
    {
        for (int i=0; i <array.length; i++)
        {
            for(int o=0;o<array[i].length;o++)
            {
                array[i][o]=(int)(Math.random()*10);
            }

        }
    }
    public static void SumBollard(int[][]array)
    {
        int sum = 0;
        for(int o=0; o<array[0].length;o++)
        {
            for (int i = 0; i < array.length; i++)
            {
                sum += array[i][o];
            }
            System.out.printf("Сумма " + o + " стоблца: " + sum + '\n');
            sum = 0;
        }
    }
}