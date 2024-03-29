import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       String x= new String("codeforces");
        int cases= input.nextInt();
        while (cases-->0)
        {

            if( x.contains(input.next()))
            System.out.println("YES");
            else System.out.println("no");

        }
        input.close();

    }
}