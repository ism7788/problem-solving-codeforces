import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0) {
            int n = in.nextInt();
            String x = in.next();boolean c=true;
            for(int i=0;i<n-1;i++)
            {
                if(x.charAt(i)==x.charAt(i+1))continue;
                for(int j=i+1;j<n;j++)
                {
                    if(x.charAt(i)==x.charAt(j))
                    {
                        System.out.println("NO");c=false;break;
                    }
                }
                if(!c)break;
            }
            if(c)System.out.println("YES");
        }
    }
}