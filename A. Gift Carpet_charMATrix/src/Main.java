import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases= in.nextInt();
        while (cases-->0) {
            int n = in.nextInt();
            int m = in.nextInt();
            char[][] charMat = new char[n][m];
            in.nextLine();  // consume newline left-over
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < n; i++) {
                String line = in.nextLine();
                for (int j = 0; j < m; j++) {
                    charMat[i][j] = line.charAt(j);
                    word.append(charMat[i][j]);
                }
            }
           //  System.out.println(word);
            StringBuilder word2 = new StringBuilder();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    word2.append(charMat[j][i]);
                }
            }
           //  System.out.println(word2);
            if(containsInOrder(String.valueOf(word), "vika")||containsInOrder(String.valueOf(word2), "vika"))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean containsInOrder(String str, String target) {
        int index = 0;
        for (char c : str.toCharArray()) {
            if (c == target.charAt(index)) {
                index++;
                if (index == target.length()) {
                    return true;
                }
            } else if (target.indexOf(c) != -1) {
                index = 0;
            }
        }
        return false;
    }
}
