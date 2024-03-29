import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cases= input.nextInt();
        while (cases-->0)
        {
            int n= input.nextInt();
            int countDigits=countDigits(n);
            int sum=0;
            if (countDigits==1)
            {
                System.out.println(10*(n%10-1)+1);

            }
            if(countDigits==2)
            {
                System.out.println(10*(n%10-1)+3);
            }
            if (countDigits==3)
            {
                System.out.println(10*(n%10-1)+6);
            }
            if (countDigits==4)
            {
                System.out.println(10*(n%10-1)+10);
            }
        }
    }
    //count the number of digits in a number	:

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            ++count;
        }
        return count;

    }
}