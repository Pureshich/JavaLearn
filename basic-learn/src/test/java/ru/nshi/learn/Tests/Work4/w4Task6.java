package ru.nshi.learn.Tests.Work4;

import java.util.Scanner;

public class w4Task6
{
    public static void main(String[] args)
    {
        w4Task6 application = new w4Task6();
        Scanner sr = new Scanner(System.in);
        int num=0;
        System.out.print("кол-во строк: ");
        num=sr.nextInt();
        String[] array = new String[num];
        for(int i =0;i<array.length;i++)
        {
            System.out.print("Введите строку: ");
            array[i]=sr.next();
        }

        application.sorting(array);
    }

    public String sorting(String[] array)
    {
        String wishlist=" ";
        String result="";
        boolean ok=true;
        String bestString="";
        for (int k=0;k<array.length;k++) {
            for (int i = 0; i < array[k].length(); i++) {
                for (int j = 0; j < wishlist.length(); j++) {
                    if (array[k].charAt(i) != wishlist.charAt(j)) {
                        ok = true;
                    } else {
                        ok = false;
                        break;
                    }
                }
                if (ok)
                {
                    result += array[k].charAt(i);
                    wishlist += array[k].charAt(i);
                }
            }
            if (result.length() > bestString.length()) {
                bestString = result;
                wishlist = " ";
                result = "";
            }
        }
        System.out.println(bestString);
        return bestString;
    }
}


