package ru.nshi.learn.Tests.Work1;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Task1 application = new Task1();
        while(true)
        {
            System.out.print("Введите 6-ти значное число: ");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int length = String.valueOf(num).length();

            if(length==6)//проверяем ялвяется ли число 6-ти значным
            {
                application.NumberCheck(num);
            }
            else//если число не шестизначное
            {
                System.out.println("Я сказал шестизначное D:<<");
            }
        }

    }
    public boolean NumberCheck(int num)
    {
        System.out.println("OK");
        int FirstThreeNum = num/1000;//найдем первые три цифры
        int LastThreeNum = num%1000;//последние три цифры
        int Fsum = 0;
        int Lsum = 0;
        while (FirstThreeNum > 0)
        {
            Fsum =  Fsum + FirstThreeNum % 10;
            FirstThreeNum = FirstThreeNum / 10;
        }
        while (LastThreeNum > 0)
        {
            Lsum =  Lsum + LastThreeNum % 10;
            LastThreeNum = LastThreeNum / 10;
        }
        if(Fsum==Lsum)//если сумма первых трех цифр равняется сумме последних
        {
            System.out.println("твое число счасливое c:");
            return true;
        }
        else
        {
            System.out.println("твое число не счасливое ;c");
            return false;
        }

    }

}
