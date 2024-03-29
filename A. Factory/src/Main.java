/*
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a= in.nextBigInteger();
        BigInteger m= in.nextBigInteger();
        BigInteger cases= BigInteger.valueOf(m.longValue());



        //try cases XD
        while (!cases.equals(BigInteger.ONE))
        {
                 a= a.add (a.mod(m) );
       //System.out.println(a);
           // if(a==m)
             //   break;
            cases=cases.subtract(BigInteger.ONE);

        }
     if(a.mod(m).equals(BigInteger.ZERO))
        System.out.println("Yes");
       else System.out.println("No");


    }
}
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> set = new LinkedHashSet<>();
        int a = input.nextInt();
        int m = input.nextInt();
        a %= m;
        while (a != 0 && set.add(a)) {
            a *= 2;
            a %= m;
        }
        List<Integer> myList = new ArrayList<>(set);

        // Sort the list
        Collections.sort(myList);

        // Print the sorted list
        System.out.println(myList);
        System.out.println((a == 0) ? "Yes" : "No");
    }

}