import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cases= input.nextInt();
        while (cases-->0)
        {
            int n= input.nextInt();
            int x= input.nextInt();
            for(int i=0;;i++)
            {

                if(n<= 2+x*i)
                {
                    System.out.println(++i);
                    break;
                }

            }

        }
    }
}