package Work1;
import java.util.Scanner;
public class Task3
{
    public static void main(String[] agrs)
    {
        while(true)
        {
            System.out.print("Введите число: ");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            boolean eazy = false;
            if (num == 0)//если пользователь вводит 0 то программа выключается
            {
                return;
            }
            if(num > 3)
            {
                for(int i = 2;i < num-1; i++ )
                {
                    eazy = false;
                    if(num % i!=0)
                    {
                        eazy = true;
                    }
                    else
                    {
                        System.out.println("число сложное");
                        break;
                    }
                }
                if(eazy == true)
                {
                    System.out.println("число простое");
                }
            }
            else
            {
                if(num == 3 || num == 2)
                {
                    System.out.println("число простое");
                }
                else
                {
                    System.out.println("число сложное");
                }
            }
        }
    }
}
