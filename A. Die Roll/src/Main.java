import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y = scanner.nextInt();
        int W = scanner.nextInt();
        int max = Math.max(Y, W);
        int favorableOutcomes = 6 - max + 1;
        int gcd = gcd(favorableOutcomes, 6);
        System.out.println((favorableOutcomes/gcd) + "/" + (6/gcd));

    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}