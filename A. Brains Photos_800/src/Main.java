import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
       int m= input.nextInt();
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                String x= input.next();
        if (x.matches(".*[CMY].*")) {
            System.out.println("#Color");
            return;
        }
          }

        } System.out.println("#Black&White");
    }
}