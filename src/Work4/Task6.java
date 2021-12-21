package Work4;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args)
    {
        Task6 application = new Task6();
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
        String wishlist=" ";
        application.sorting(array,wishlist);
    }

    public void sorting(String[] array,String wishlist)
    {
        String answer="";
        boolean ok=true;
        String bestString="";
        for (String s : array) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < wishlist.length(); j++) {
                    if (s.charAt(i) != wishlist.charAt(j)) {
                        ok = true;
                    } else {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    answer += s.charAt(i);
                    wishlist += s.charAt(i);
                }
            }
            if (answer.length() > bestString.length()) {
                bestString = answer;
                wishlist = " ";
                answer = "";
            }
        }
        System.out.println(bestString);
    }
}


