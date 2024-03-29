/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if ( i<1 && s.charAt(i) == '1' ) {
                    sum++;


                }
                else if (  s.charAt(i) == '1' &&sum==0) {
                    sum++;

                    sb.append('+');
                }
                else if ( s.charAt(i) == '1' && sum>0 ) {
                    sum--;
                    sb.append('-');
                }
                else if( i>=1 && s.charAt(i)=='0')
                {
                    sb.append('+');
                }
                }



            System.out.println(sb);
        }
    }
}
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1')
                {
                    if (i < 1 || sum == 0) {
                        sum++;
                        if(i>1) {

                            sb.append('+');
                        }
                    } else {
                        sum--;
                        sb.append('-');
                    }
                } else {
                    sb.append('+');
                }
            }
            System.out.println(sb);
        }
    }
}
