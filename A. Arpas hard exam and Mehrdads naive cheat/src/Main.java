import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(1);
        } else {
            int[] lastDigit = {8, 4, 2, 6};
            System.out.println(lastDigit[(n - 1) % 4]);
        }
    }
}
