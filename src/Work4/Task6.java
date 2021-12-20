package Work4;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        String text=sr.next();
        String[] chars= new String[10];
        chars[0]=text;
        //sorting(chars);
        for (int i = 1; i<text.length(); i++)
        {
            chars[i] = sr.next(); // Заполняем массив элементами, введёнными с клавиатуры
            //System.out.println(chars[0]);
        }
        sorting(chars, sr);
        System.out.print(chars[1].charAt(2));
    }
    public  static void sorting(String[] chars,Scanner sr)
    {

       /* for (int k = 0; k < chars.length; k++)
        {
            str_1 = "";
            sr = chars[k];
            str_1 += sr.charAt(0);
            for (int i = 1; i < sr.length(); i++)
            {
                for (int j = 0; j < sr_1.length(); j++)
                {
                    if(str_1.charAt(j) == sr.charAt(i))
                    {
                    score += 1;
                    }
                }
                    if (score == 0)
                    {
                        str_1 += str.charAt(i);
                        score_1 += 1;
                    }
                    else
                    {
                        score = 0;
                    }
            }
                if (max < score_1)
                {
                    max = score_1;
                    num = k;
                }
        }
            System.out.println(chars[num]);*/
    }
}

