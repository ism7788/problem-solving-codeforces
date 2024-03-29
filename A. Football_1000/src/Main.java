import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cases= input.nextInt();
        int bCount=0;
        int aCount=0;

        String[] team= new String[cases];
        for (int i=0;i<cases;i++)
        {
            team[i]= input.next();
        }
        String teamA=team[0];aCount++;
        String teamB=null;
        for(int i=1;i<cases;i++)
        {
            if(team[i].equals(teamA))
                aCount++;
            else {
                teamB=team[i];
                bCount++;
            }
        }
        if (aCount>bCount)
            System.out.println(teamA);
        else System.out.println(teamB);

        }


        }



