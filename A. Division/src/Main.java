import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int cases= input.nextInt();
        while (cases-->0) {
            int x = input.nextInt();
            if (x <= 1399) {
                System.out.println("Division 4");
            }
            else if(x<=1599 && x>= 1400)
            {
                System.out.println("Division 3");
            }
            else if(x<=1899 && x>= 1600)
            {
                System.out.println("Division 2");
            }
            else
            {
                System.out.println("Division 1");
            }


        }
    }
}