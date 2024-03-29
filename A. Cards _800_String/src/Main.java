import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        String word= input.next();
        int oneCount=0;
        int zeroCount=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)=='n')
            {
                oneCount++;
            }
            if(word.charAt(i)=='z')
            {
                zeroCount++;
            }

        }
        for(int i=0;i<oneCount;i++)
        {
            System.out.print("1 ");
        }
        for (int i=0;i<zeroCount;i++)
        {
            System.out.print("0 ");
        }


    }
}