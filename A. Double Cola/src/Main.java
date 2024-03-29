import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String[] names = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

        int queueSize = 5;
        int index = 0;

        while (n > queueSize) {
            n -= queueSize;
            queueSize *= 2;
            index++;
        }


        System.out.println(names[ (n - 1) / (int)(Math.pow(2,index)) ]);
    }
}
