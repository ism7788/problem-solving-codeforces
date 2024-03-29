import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cases= input.nextInt();
        while (cases-->0)
        {

            int w= input.nextInt();
            int h= input.nextInt();
            int friends= input.nextInt();
            int count=1;
            if(friends==1)
            {
                System.out.println("YES");
            }
            else if(w%2!=0 && h%2!=0)
            {
                System.out.println("NO");
            }
            else {

                   while (w % 2 == 0) {
                        w /=2;
                        count*=2;
                    }
                    while ( h % 2 == 0) {
                        h /=2;
                        count*=2;
                    }

                //  System.out.println(count);
                if(count>=friends)
                    System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}