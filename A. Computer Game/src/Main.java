import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int cases= input.nextInt();
while (cases-->0) {
    int size = input.nextInt();
    input.nextLine(); // consume newline left-over
    String row1 = input.nextLine();
    String row2 = input.nextLine();
    boolean flag = false;
    for (int i = 0; i < size; i++) {

        if (    row1.charAt(i) == '1' && row2.charAt(i) == '1') {
            flag = false;
            break;
        }
        flag = true;
    }
    if (flag)
        System.out.println("YES");
    else System.out.println("NO");
}
    }
}