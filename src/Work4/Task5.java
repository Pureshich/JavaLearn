package Work4;

import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        Task5 application = new Task5();
        Scanner sr = new Scanner(System.in);
        String text;
        text = sr.next();
        String wishlist=" ";
        application.sorting(text,wishlist);
    }
    public void sorting(String text,String wishlist)
    {
        String answer="";
        boolean ok=true;
        for(int i=0;i<text.length();i++)
        {
            for(int j=0;j<wishlist.length();j++)
            {
                if(text.charAt(i)!=wishlist.charAt(j))
                {
                    ok = true;
                }
                else
                {
                    ok=false;
                    break;
                }
            }
            if(ok == true)
            {
                answer += text.charAt(i);
                wishlist+=text.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
