import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cases= input.nextInt();
        // int cases=1;
        while (cases-->0){
            int num= input.nextInt();
            for (int i=0;i<=num;i++)
            {

                if (  Math.pow(2,i)<=num &&  Math.pow(2,i+1)> num   )
                {

                    System.out.println( (int) (Math.pow(2,i)-1));
                    break;

                }
            }

        }
    }
}
/*
AI GEn
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(Integer.highestOneBit(n) - 1);
        }
    }
}

 */