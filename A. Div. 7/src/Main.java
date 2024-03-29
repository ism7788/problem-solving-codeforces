import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
      int cases= input.nextInt();
      while (cases-->0)
      {
          int num= input.nextInt();
          if(num%7==0)
              System.out.println(num);
          else {
              num =num/10 *10;
              while (num%7!=0) {num++;}

              System.out.println(num);
          }
      }



           }
}