import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();
        int n4= input.nextInt();
        int caloriesCount=0;
        String x= input.next();
        
        for(int i=0;i<x.length();i++)
        {
           
            if(Integer.parseInt(String.valueOf(x.charAt(i)))==1)
            {
                caloriesCount+=n1;
            }
            if(Integer.parseInt(String.valueOf(x.charAt(i)))==2)
            {
                caloriesCount+=n2;
            }
            if(Integer.parseInt(String.valueOf(x.charAt(i)))==3)
            {
                caloriesCount+=n3;
            }
            if(Integer.parseInt(String.valueOf(x.charAt(i)))==4)
            {
                caloriesCount+=n4;
            }
        }
        System.out.println(caloriesCount);
    }
}