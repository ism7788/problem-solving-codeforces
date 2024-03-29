/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases= input.nextInt();
        while (cases-->0)
        {
            int size= input.nextInt();
            int[] y=new int[size];
            for (int i=0;i<size;i++)
            {
                y[i]= input.nextInt();
            }
            sortingX(y);
            System.out.println();
        }


    }
    public static void sortingX(int[] x )
    {
        int[] sortedx = new int[x.length];
        int half=0;
        if(x.length%2==0)
            half=x.length/2;
        else{
            half=x.length/2+1;
        }
        for (int start=0,i=0,end = x.length-1; start<half;start++,end--,i+=2  )
        {
            sortedx[i]=x[start];
            //System.out.println("x[s]  "+x[start]);
            if(i+1<half*2-1) {
                sortedx[i + 1] = x[end];
            }
            if(x.length%2==0) {
                sortedx[x.length - 1] = x[half];
            }
        }
        for(int i=0;i<x.length;i++)
        {
            System.out.print(sortedx[i]+" ");
        }

    }
}*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while (cases-- > 0) {
            int size = input.nextInt();
            int[] y = new int[size];
            for (int i = 0; i < size; i++) {
                y[i] = input.nextInt();
            }
            printSortedSequence(y);
            System.out.println();
        }
    }

    public static void printSortedSequence(int[] x) {
        int half = x.length % 2 == 0 ? x.length / 2 : x.length / 2 + 1;
        for (int start = 0, end = x.length - 1; start < half; start++, end--) {
            System.out.print(x[start] + " ");
            if (start != end) {
                System.out.print(x[end] + " ");
            }
        }
    }
}
