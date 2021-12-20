package Work1 ;

public class Task4
{
    public static void main(String[] args)
    {

        int sum= 0;
        for(int num =1000;num<2000;num++)//задаем диапазон от 1000 до 2000
        {
            boolean eazy = false;
            for(int i = 2;i < num-1; i++ )
            {
                eazy= false;
                if(num % i!=0)
                {
                    eazy = true;
                }
                else
                {
                    break;
                }
            }
            if (eazy == true)
            {
                System.out.println(num);
               // System.out.print(num+" ");
                sum=sum + num;
            }
        }
        System.out.print(sum);
    }
}
