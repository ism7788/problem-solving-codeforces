import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int a= input.nextInt();
        int b= input.nextInt();
        int []chores=new int[n];
        for (int i=0;i<n;i++)
        {
            chores[i]= input.nextInt();
        }
        Arrays.sort(chores);

        if(chores[b-1]<chores[b])
        {
            System.out.println(chores[b]-chores[b-1]);
        }
        else System.out.println(0);
    }
}