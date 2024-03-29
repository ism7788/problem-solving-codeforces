import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int[] coins=new int[num];
        int max=0;
        int countCoins=0;
        for(int i=0;i<num;i++)
        {
            coins[i]= input.nextInt();
            if(coins[i]>max)
            {
                max=coins[i];
            }
        }
        for(int i=0;i<num;i++)
        {
            if(coins[i]<max)
            {
                countCoins+=(max-coins[i]);
            }
        }
        System.out.println(countCoins);
    }
}