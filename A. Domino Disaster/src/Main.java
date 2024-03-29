import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int cases= in.nextInt();
        while (cases-->0)
        {
            int n= in.nextInt();
            String x= in.next();

           if ( x.contains("U") )
               System.out.println(x.replace('U','D'));
           else
               System.out.println(x.replace('D','U'));
        }
    }
}