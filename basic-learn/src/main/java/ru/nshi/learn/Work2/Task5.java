package Work2;

import java.util.Random;

public class Task5
{
    public static void main(String[] args)
    {
        int[] MINMAX= new int[2];//индекс минимального и максимального числа

        Task5 application = new Task5();
        int[] array = new int[5];
        int maxInt=0;
        int minInt=100;
        application.fillArray(array);
        application.PrintArray(array);//выодим изначальный массив(для проверки)
        application.searchMaxMinIntInArray(array, maxInt, minInt,MINMAX);
        application.average(array, MINMAX);
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
            System.out.println(array[i]+", ");
        }
        System.out.println("");
    }

    public  int[] searchMaxMinIntInArray(int[] array, int maxInt, int minInt, int[] MINMAX)//сразу выщитываем максимально и минимальное знач. + записыавем их номера
    {
        for (int i = 0;i < array.length;i++)
        {
            if(array[i]>maxInt)//max
            {
                maxInt=array[i];
                MINMAX[1] = i;
            }
        }
        for (int b = 0;b < array.length;b++)
        {
            if(array[b]<minInt)//min
            {
                minInt = array[b];
                MINMAX[0] = b;
            }
        }
        System.out.println("максимальное число: "+ array[MINMAX[1]]);
        System.out.println("минимальное число: "+ array[MINMAX[0]]);
        return MINMAX;//возращаем массив в котором на первом месте записан индекс минимального а на втором индекс максимального числа
    }
    public void average(int[] array,int[] MINMAX)
    {
        int sum = 0;//сумма чисел между максимальным и минимальным(или наоборот)
        int count=0;//счетчик количества этих чисел

        if(MINMAX[1]> MINMAX[0])//если максимальное число стоит правее минимального
        {
            for(int i=MINMAX[1]-1; i>MINMAX[0];i--)//-1 -не берем в расчет само максимальное число
            {
                sum +=array[i];
                count++;
            }
        }
        if( MINMAX[1]< MINMAX[0])//если максимальное число стоит левее минимального
        {
            for(int i=MINMAX[1]+1; i<MINMAX[0];i++)
            {
                sum +=array[i];
                count++;
            }
        }
        if(sum != 0)//проверяем сумму чтоб не делить на ноль
        {
            System.out.println("Средние арфимитическое промежутка = "+ sum/count);
        }
        else
        {
            System.out.println("в промежутке между "+array[MINMAX[1]] +" и "+array[MINMAX[0]]+" чисел нет");
        }
    }
}
