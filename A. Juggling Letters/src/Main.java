import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        while (cases-- > 0) {
            int n = scanner.nextInt();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String s = scanner.next();
                for (char c : s.toCharArray()) {
                    map.put(c, map.getOrDefault(c, 0) + 1);
                }
            }
            System.out.println("+====================================");
            System.out.println(map);
            System.out.println("+====================================");
            boolean flag = true;
            for (int value : map.values()) {
                if (value % n != 0) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
        scanner.close();
    }
}
