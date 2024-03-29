/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int cases = input.nextInt();
      //  while (cases-->0){
            int twoCount=0;
            int threeCount=0;
            int n= input.nextInt();
            if(n%2==0)
            {
                int num=n/2;
                System.out.println(num);
                while (num-->0)
                {
                    System.out.print(2+" ");
                }
            }
       */
/*     else if(n%3==0)
            {
                int num=n/3;
                System.out.println(num);
                while (num-->0)
                {
                    System.out.print(3+" ");
                }
            }*//*

            else
            {
                 int num=n-3;
                 int cou=num/2;
                System.out.println(cou+1);

                    System.out.print(3+" ");
                    while (cou-->0)
                    {
                        System.out.print(2+" ");

                }
            }





       // }
    }

}*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> x =new ArrayList<Integer>();
         int[]x1=maximizeTwosAndThrees(9);

        for (int i : x1) {
            x.add(i);
        }


        for (int i=0;i<x.size();i++)
        {
            System.out.println(x.get(i));
        }
    }

    public static int[] maximizeTwosAndThrees(int n) {
        int numTwos = n / 2;
        int numThrees = n % 2;
        int[] result = new int[numTwos + numThrees];
        fill(result, 0, numTwos, 2);
        fill(result, numTwos, numTwos + numThrees, 3);
        return result;
    }
}
