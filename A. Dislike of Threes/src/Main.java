import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrNOn3 = new int[1003];
        int n = 1;
        for (int i = 0; i < 1003; ) {
            if ( (n % 10) == 3 || n % 3 == 0) {

            } else {
                arrNOn3[i] = n;
                i++;
            }
            n++;
        }
        int cases= input.nextInt();
        while (cases-->0)
        {
            System.out.println(arrNOn3[input.nextInt() -1 ]);
        }

    }
}