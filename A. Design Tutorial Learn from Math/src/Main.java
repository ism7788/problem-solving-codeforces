import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int x=0;
        int y=0;
        int num1=0;
        int num2=0;
        int numodd=0;
        if(num %2==0)
        {
            numodd=num;
        }
        else numodd=num-1;


            for(int i=numodd/2;i>0&&num!=x+y;i--)
            {
                for (int j=numodd/2;j<num&&num!=x+y;j++)
                {
                    if(!isPrime(i))
                    {
                        x=i;
                        if (!isPrime(j))
                        {
                            y=j;
                        }
                    }
                    else  break;
                }





        }

        System.out.println(x+" "+y);



    }


    public static boolean isPrime(int num) {
        if(num <= 1||num==2)
        {
            return  true;
        }
        for (int i = 2; i < Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}