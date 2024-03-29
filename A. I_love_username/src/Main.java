import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         int num= input.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxCount=-1;
        int minCount=-1;
         while(num-->0)
             {
                 int poy=input.nextInt();

                    if(poy<min)
                    {
                        min=poy;
                        minCount++;
                    }
                    if(poy>max) {
                        max = poy;
                        maxCount++;
                    }
             }
        System.out.println(minCount+maxCount);
    }
}