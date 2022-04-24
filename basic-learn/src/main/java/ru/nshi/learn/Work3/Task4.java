package Work3;

public class Task4
{
    public static void main(String[] args)
    {
        Task4 application = new Task4();
        int[][] array = new int[10][10];
        application.fillArray(array);
        application.printArray(array);
        application.selectionSort(array);
        application.printArray(array);
    }

    public  int[][]  fillArray(int[][] array)
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
        System.out.println("массив:");
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
    public int[][] selectionSort(int[][] array)
    {
        for (int w = 0; w < array.length; w++) {
            for (int h = 0; h < array.length; h++) {
                int min1 = w;
                int min2 = h;
                for (int j = w; j < array.length; j++)
                {
                    if ( j == w )
                    {
                        for (int l = h; l < array.length; l++)
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
                int change = array[w][h];
                array[w][h] = array[min1][min2];
                array[min1][min2] = change;
            }
        }
        return array;
    }
}
