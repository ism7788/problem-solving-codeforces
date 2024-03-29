import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            char[] arr = in.next().toCharArray();
            while (m-- > 0) {
                char[] newArr = arr.clone();
                for (int i = 0; i < n; i++) {
                    if (arr[i] == '0') {
                        int aliveNeighbors = 0;
                        if (i > 0 && arr[i - 1] == '1') aliveNeighbors++;
                        if (i < n - 1 && arr[i + 1] == '1') aliveNeighbors++;
                        if (aliveNeighbors == 1) newArr[i] = '1';
                    }
                }
                if (new String(arr).equals(new String(newArr))) {
                    break;
                }
                arr = newArr;
            }
            System.out.println(new String(arr));
        }
    }
}
