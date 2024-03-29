import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfSteps= input.nextInt();
        int moves_num= input.nextInt();
        int minMoves=0;
        if(moves_num>numberOfSteps)
        {
            System.out.println(-1);
            return;
        }
        if(numberOfSteps%2==0)
        {
            minMoves=numberOfSteps/2;
        }
        else{ minMoves=numberOfSteps/2+1;}
      //  System.out.println(minMoves);

        for(int i=minMoves;i<=numberOfSteps;i++) {
            if (i % moves_num == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}