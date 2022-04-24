package ru.nshi.learn.Tests.Work4;

import java.util.Scanner;

public class w4Task7
{
    public static void main(String[] args)
    {
        w4Task7 application = new w4Task7();
        Scanner sr = new Scanner(System.in);

        String [] array;
        String text;
        System.out.print("Введите предложение: ");
        text = sr.nextLine();

        int wordCount = 0;


        for(int i =0; i < text.length(); i++)
        {
            if(!Character.isSpaceChar(text.charAt(i)))
            {

                wordCount++;
            }
        }
        array = new String[wordCount];

        application.enter(array,text);
        application.sorting(array);
    }
    public String[] enter(String[] array,String text)
    {
        int i=-1;
        for(int k =0;k<array.length;k++)
        {
            array[k]="";
            i++;
            for (; i < text.length(); i++)
            {
                if(!Character.isSpaceChar(text.charAt(i)))
                {

                    array[k]+=text.charAt(i);
                }
                else
                {
                    break;
                }
            }
        }
        return array;
    }

    public String sorting(String[] array)
    {
        String wishlist=" ";
        String answer="";
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
                    answer += array[k].charAt(i);
                    wishlist += array[k].charAt(i);
                }
            }
            if (answer.length() > bestString.length()) {
                bestString = answer;
                wishlist = " ";
                answer = "";
            }
        }
        System.out.println(bestString);
        return bestString;
    }
}


