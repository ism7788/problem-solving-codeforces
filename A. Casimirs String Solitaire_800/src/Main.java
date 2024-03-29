import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while (cases-- > 0)
        {
            String word = input.next();
        int Acount = countChar(word, 'A');
        int Bcount = countChar(word, 'B');
        int Ccount = countChar(word, 'C');

        if (Bcount == Acount + Ccount)
            System.out.println("YES");
        else System.out.println("NO");
    }


    }
    public static int countChar(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
    }

