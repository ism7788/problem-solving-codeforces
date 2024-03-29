/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        while (cases-- > 0) {
        int size = in.nextInt();
            String word = in.next();

            char[] chars = word.toLowerCase().toCharArray();
            LinkedHashSet<Character> set=new LinkedHashSet<>();
            for(char c:chars)
                {
                    set.add(c);
                    if(c=='m');
                }
          //  System.out.println(set);
            LinkedList<Character> list=new LinkedList<>(set);
          // System.out.println(list);
            String str="meow";
            boolean x=false;
            for (int i=0;i<str.length()&&i<list.size();i++)
            {
                if(str.charAt(i)==list.get(i))
                    x=true;
                else
                {x=false;
                        break;}

            }

             if(x &&list.size()==4 ) System.out.println("YES");
            else System.out.println("NO");




        }
    }
}*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        while (cases-- > 0) {
            int size = in.nextInt();
            String word = in.next().toLowerCase();
            int state = 0;
            for (char c : word.toCharArray()) {
                switch (state) {
                    case 0:
                        if (c == 'm') state = 1;
                        else state = -1;
                        break;
                    case 1:
                        if (c == 'e') state = 2;
                        else if (c != 'm') state = -1;
                        break;
                    case 2:
                        if (c == 'o') state = 3;
                        else if (c != 'e') state = -1;
                        break;
                    case 3:
                        if (c == 'w') state = 4;
                        else if (c != 'o') state = -1;
                        break;
                    case 4:
                        if (c != 'w') state = -1;
                        break;
                }
                if (state == -1) break;
            }
            if (state == 4) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
