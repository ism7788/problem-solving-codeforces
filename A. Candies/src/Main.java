import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int k = 2; ; ++k) {

                if ((n % ((1 << k) - 1)) == 0) {
                    System.out.println(n / ((1 << k) - 1));
                    break;
                }
            }
        }
    }
}
