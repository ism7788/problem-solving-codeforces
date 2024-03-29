import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cases= in.nextInt();
        while (cases-->0)
        {
            int num= in.nextInt();

            if(num<9) System.out.println(0);

            else {
                if(num%10==9)
                    System.out.println( (num / 10 )+1);
                else
                System.out.println(num / 10);
            }

        }
    }
}