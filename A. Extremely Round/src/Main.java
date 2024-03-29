/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int cases= in.nextInt();
        while (cases-->0)
        {
            int n= in.nextInt();
            int numberOfInts=0;
            for(int i=n;i>0;i--) {
                if (nonZeroCounter(i) ==1)
                {
                  numberOfInts++;

                }

            }
            System.out.println(numberOfInts);

        }


    }
    public static int nonZeroCounter(int num)
    {
        String num_string= String.valueOf(num);
        int nonZeros=0;
      for(int i=0 ;i<num_string.length();i++)
      {
          if(num_string.charAt(i)!='0')
              nonZeros++;
      }
      return nonZeros;
    }
}*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        while (cases-- > 0) {
            int n = in.nextInt();
            int numberOfInts = 0;
            for (int i = 1; i <= n; i++) {
                if (isExtremelyRound(i)) {
                    numberOfInts++;
                }
            }
            System.out.println(numberOfInts);
        }
    }

    public static boolean isExtremelyRound(int num) {
        int nonZeros = 0;
        while (num > 0) {
            if (num % 10 != 0) {
                nonZeros++;
                if (nonZeros > 1) {
                    return false; // more than one non-zero digit
                }
            }
            num /= 10;
        }
        return true;
    }
}
