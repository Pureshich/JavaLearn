package Work3;

import java.util.Arrays;

public class Task4
{
    public static void main(String[] args)
    {
        int[][] array = new int[10][10];
        FillArray(array);
        System.out.println("Наш массив:");

        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
        System.out.println("\n");
        selectionSort2(array);
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
    public static void selectionSort2(int[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                int min1 = i;
                int min2 = k;
                for (int j = i; j < array.length; j++)
                {
                    if ( j == i )
                    {
                        for (int l = k; l < array.length; l++)
                        {
                            if (array[j][l] < array[min1][min2])
                            {
                                min1 = j;
                                min2 = l;
                            }
                        }
                    }
                    else
                    {
                        for (int l = 0; l < array.length; l++)
                        {
                            if (array[j][l] < array[min1][min2])
                            {
                                min1 = j;
                                min2 = l;
                            }
                        }
                    }
                }
                int swap = array[i][k];
                array[i][k] = array[min1][min2];
                array[min1][min2] = swap;
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
    private static void swap(int[] array, int ind1, int ind2)
    {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
