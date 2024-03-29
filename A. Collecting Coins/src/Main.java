import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cases= input.nextInt();
        while (cases-->0)
        {
            int sum=0;
           int a= input.nextInt();
           int b= input.nextInt();
           int c= input.nextInt();
           int n= input.nextInt();
           int max=Math.max(a,Math.max(b,c));
           int min=Math.min(a,Math.min(b,c));

           int mid= a+b+c-min-max;
            sum=2*max-min-mid;

            if ( n-sum>=0 && (n-sum)%3==0) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}