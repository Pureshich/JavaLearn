package Work4;

import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        String text,txt="";
        text = sr.next();
        txt += text.charAt(0);
        sorting(text,txt);
    }
    public  static void sorting(String text,String txt)
    {
        int score=0;
        for (int i = 1; i < text.length(); i++) {
            for (int j = 0; j < txt.length(); j++) {
                if (txt.charAt(j) == text.charAt(i)) {
                    score += 1;
                }
            }
            if (score == 0) {
                txt += text.charAt(i);
            }
            else {
                score = 0;
            }
        }
        System.out.println(txt);
    }
}
