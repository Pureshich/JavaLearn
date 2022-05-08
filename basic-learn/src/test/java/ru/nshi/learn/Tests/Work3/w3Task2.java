package ru.nshi.learn.Tests.Work3;

public class w3Task2
{
    public static void main(String[] args)
    {
        w3Task2 application = new w3Task2();
        int[][] array = new int[10][10];
        int[] resultArray= new int[10];
        application.fillArray(array);
        application.printArray(array);

        application.SumColumns(array,resultArray);
        application.printResultArray(resultArray);
    }
    public  int[][] fillArray(int[][] array)
    {
        for (int i=0; i <array.length; i++)
        {
            for(int o=0;o<array[i].length;o++)
            {
                array[i][o]=(int)(Math.random()*10);
            }
        }
        return array;
    }
    public void printArray(int [][] array)
    {
        System.out.println("Наш массив:");
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
    }
    public void printResultArray(int[] resultArray)
    {
        System.out.print("[ ");
        for (int i=0; i <resultArray.length; i++)
        {
            System.out.print(resultArray[i]+", ");
        }
        System.out.print("]"+"\n");
    }
    public int[] SumColumns(int[][]array,int[] sumArray)
    {
        int sum = 0;
        for (int i =0; i < array[0].length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                sum += array[j][i];
            }
            sumArray[i]=sum;//записываем сумму в масcив
            sum = 0;
        }
        return sumArray;
    }
}
