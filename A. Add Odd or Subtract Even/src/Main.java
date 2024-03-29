import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cases= input.nextInt();
        while (cases-->0) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == b) {
                System.out.println(0);
            }
            if (a < b) {
                if ((b - a) % 2 != 0) {
                    System.out.println(1);
                } else System.out.println(2);
            } else {
                if ((b - a) % 2 == 0) {
                    System.out.println(1);
                } else System.out.println(2);
            }
        }
    }
}