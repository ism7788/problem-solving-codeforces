/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] four = new int[4];
        int cases = input.nextInt();
        while (cases-- > 0) {
            for (int i = 0; i < 4; i++) {
                four[i] = input.nextInt();
            }
            int max1 = Math.max(four[0], four[1]);
            int max2 = Math.max(four[2], four[3]);
            Arrays.sort(four);
            if (max1 + max2 == four[3] + four[2]) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}*/

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        while (cases-- > 0) {
            int[] skills = new int[4];
            for (int i = 0; i < 4; i++) {
                skills[i] = input.nextInt();
            }
            int max1 = Math.max(skills[0], skills[1]);
            int max2 = Math.max(skills[2], skills[3]);
            int highest = Math.max(max1, max2);
            int secondHighest = Math.min(max1, max2);
            for (int skill : skills) {
                if (skill > highest) {
                    secondHighest = highest;
                    highest = skill;
                } else if (skill > secondHighest && skill < highest) {
                    secondHighest = skill;
                }
            }
            if ((max1 == highest && max2 == secondHighest) || (max1 == secondHighest && max2 == highest)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}


