package Work1 ;

public class Task2
{
    static int number = 100000;
    static int sum = 0;
    public static void main(String[] args)
    {
        while(number < 1000000)
        {
            number++;
            int FirstThreeNum = number/1000;
            int LastThreeNum = number%1000;
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
            if(Fsum==Lsum)
            {
                sum = sum+number;
            }
        }
        System.out.println("сумма всех 6ти значных счасливых чисел: "+ sum);
    }
}

