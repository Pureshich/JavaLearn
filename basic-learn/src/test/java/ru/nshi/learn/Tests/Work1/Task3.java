package ru.nshi.learn.Tests.Work1;
import java.util.Scanner;
public class Task3
{
    public static void main(String[] agrs) {
        Task3 application = new Task3();
        while (true) {
            System.out.print("Введите число: ");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            boolean eazy = false;
            if (num == 0)//если пользователь вводит 0 то программа выключается
            {
                return;
            } else {
                application.intCheck(num, eazy);
            }

        }
    }
    public boolean intCheck(int num, boolean eazy)
    {
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
                    return false;
                }
            }
            if(eazy == true)
            {
                System.out.println("число простое");
                return true;
            }
        }
        else
        {
            if(num == 3 || num == 2)
            {
                System.out.println("число простое");
                return true;
            }
            else
            {
                System.out.println("число сложное");
                return false;
            }
        }
        return eazy;
    }
}
