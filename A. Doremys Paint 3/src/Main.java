/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        while (cases-- > 0) {
            int n = in.nextInt();
            ArrayList<Integer> numS = new ArrayList<>();
            boolean flag=false;
            while (n-- > 0) {
                numS.add(in.nextInt());
            }
            Set set = new HashSet<>(numS);

            // Create a HashMap to store the frequency of each number
            Map<Integer, Integer> integerIntegerMap = new HashMap<>();
            for (int num : numS) {
                integerIntegerMap.put(num, integerIntegerMap.getOrDefault(num, 0) + 1);
            }

            if(set.size() == 2) {
                // Initialize num1 and num2
                int num1 = 0, num2 = 0;

                // Iterator for the entry set
                Iterator<Map.Entry<Integer, Integer>> iterator = integerIntegerMap.entrySet().iterator();

                // Get the first two entries
                if (iterator.hasNext()) {
                    num1 = iterator.next().getValue();
                }
                if (iterator.hasNext()) {
                    num2 = iterator.next().getValue();
                }
                if(Math.abs(num1-num2)<2)
                    flag=true;


            }
            if (flag||set.size()==1)
                System.out.println("YES");
            else System.out.println("NO");

            }
        }
    }

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        while (cases-- > 0) {
            int n = in.nextInt();
            Map<Integer, Integer> numFrequency = new HashMap<>();
            while (n-- > 0) {
                int num = in.nextInt();
                numFrequency.put(num, numFrequency.getOrDefault(num, 0) + 1);
            }

            if (numFrequency.size() == 1) {
                System.out.println("YES");
            } else if (numFrequency.size() == 2) {
                Iterator<Integer> iterator = numFrequency.values().iterator();
                int num1 = iterator.next();
                int num2 = iterator.next();
                System.out.println(Math.abs(num1 - num2) < 2 ? "YES" : "NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}
