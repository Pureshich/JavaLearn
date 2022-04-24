package Work4;
import java.util.Arrays;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Task1 application = new Task1();
        Scanner sr = new Scanner(System.in);
        String text=sr.next();
        application.sorting(text);
    }
    public void sorting(String text)
    {
        int num=0;
        while (num <= text.length())
        {
            for(int i=0;i<num;i ++)
            {
                System.out.print(text.charAt(i));
            }
            System.out.println("\n");
            num++;
        }
    }
}
