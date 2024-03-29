import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    {
        Scanner input = new Scanner(System.in);
            int ones = 0;
            int maxImprovement = 0;
            int improvement = 0;
            int N = input.nextInt();

            for (int n = 0; n < N; n++) {
                int value = input.nextInt();
                ones += (value == 1) ? 1 : 0;
                value = (value == 1) ? -1 : 1;
                improvement += value;
                improvement = Math.max(improvement, 0);
                maxImprovement = Math.max(maxImprovement, improvement);
            }

            System.out.println(maxImprovement == 0 ? ones - 1 : ones + maxImprovement);
        }
    }
}
