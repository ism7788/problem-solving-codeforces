import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int cases= input.nextInt();
        double n=2;
        while (cases-->0) {
            boolean flag = false;
            double angle = input.nextDouble();
            System.out.println(isRegularPolygonAngle(angle));
        }

    }
    public static String isRegularPolygonAngle(double angle) {
        if (angle < 1 || angle > 180) {
            return "Invalid input. Angle must be between 1 and 180.";
        } else {
            for (double n = 3; n <= 360; n++) {
                if ((n - 2) * 180.0f / n == angle) {
                    return "YES";
                }
            }
            return "NO";
        }
    }

}
