package Work3;

public class Task3
{
    public static int sumVertical=0,sumHorizontal=0,sumDiagonal=0;
    public static void main(String[] args)
    {
        Task3 application = new Task3();
        int[][] array = new int[3][3];
        application.fillArray(array);
        application.printArray(array);
        application.SumBollard(array);
        application.Sum(array);
        application.SumDiagonal(array);
        application.Compare( sumVertical, sumHorizontal,array);
    }
    public  int[][]  fillArray(int[][] array)
    {
            /*array[0][0]=2;//для проверки заполним массив магическим квадратом
            array[0][1]=7;
            array[0][2]=6;

            array[1][0]=9;
            array[1][1]=5;
            array[1][2]=1;

            array[2][0]=4;
            array[2][1]=3;
            array[2][2]=8;*/
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
    public int SumBollard(int[][]array)//высчитываем сумму столбцов
    {
        for(int o=0; o<array[0].length;o++)
        {
            for (int i = 0; i < array.length; i++)
            {
                sumVertical += array[i][o];
            }
        }
        return sumVertical;
    }
    public int Sum(int[][]array)//высчитываем сумму строк
    {
        //int sumHorizontal = 0;
        for (int i=0; i <array.length; i++)
        {
            for(int o=0;o<array[i].length;o++)
            {
                sumHorizontal += array[i][o];
            }
        }
        return sumHorizontal;
    }
    public int SumDiagonal(int[][] array)//смотрим диагонали
    {
        int sum=0;
        for (int i =0,j=0; i<array.length;i++)//проверяем  слева направо
        {
            if(j<array[i].length)
            {
                sumDiagonal += array[i][j];
                j++;
            }
        }
        for (int i =0,j=array.length-1; i<array.length;i++)//проверяем справа налево
        {
            if(j>=0)
            {
                sum += array[i][j];
                j--;
            }
        }
        if(sum !=sumDiagonal )
        {
            sumDiagonal=0;
        }
        return sumDiagonal;
    }
    public void Compare(int sumVertical, int sumHorizontal, int[][]array)//равниваем сумму столбцов и строк
    {
        if(sumHorizontal/array.length == sumVertical/array.length && sumHorizontal/array.length==sumDiagonal)
        {
          System.out.printf("это магический квадрат с;");
        }
        else
        {
            System.out.printf("не магический ;c");
            return;
        }
    }
}
