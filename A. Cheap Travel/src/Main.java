import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int m= input.nextInt();
        int a= input.nextInt();
        int b= input.nextInt();
        int countMoney=0;
        while (n>0)
        {
         if(n>=m )
         {
             if( a>=(double)b/m)
             {

                 n-=m;
                 countMoney+=b;

             }

             else {
                 n--;
                 countMoney+=a;
             }

         }
         else
         {
             if( n*a<b )
             {

                 n--;
                 countMoney+=a;

             }
             else {

                 n -= m;
                 countMoney += b;
             }
         }

        }
        System.out.println(countMoney);
    }
}