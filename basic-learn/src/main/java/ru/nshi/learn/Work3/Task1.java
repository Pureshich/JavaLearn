package Work3;

public class Task1
{
    public static void main(String[] args)
    {
        Task1 application = new Task1();
        int[][] array = new int[10][10];
        int[] sumArray= new int[10];
        application.fillArray(array);
        application.printArray(array);
        application.Sum(array,sumArray);
        application.printSumArray(sumArray);
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
    public void printSumArray(int[] sumArray)
    {
        System.out.print("[ ");
        for (int i=0; i <sumArray.length; i++)
        {
            System.out.print(sumArray[i]+", ");
        }
        System.out.print("]"+"\n");
    }
    public int[] Sum(int[][]array,int[] sumArray)
    {
        int sum = 0;
        for (int i=0; i <array.length; i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                sum += array[j][i];
            }
            sumArray[i]=sum;//записываем сумму в масcив
            sum = 0;
        }
        return sumArray;
    }
}
