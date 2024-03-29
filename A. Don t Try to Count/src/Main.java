import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cases= input.nextInt();
        StringBuilder newLetters ;
        while (cases-->0)
        {
            int x= input.nextInt();
            int y= input.nextInt();
            String letter= input.next();
            String word= input.next();
          newLetters=new StringBuilder( letter);
          int count=0;
            String point="ZA0";
          while (newLetters.length()<64 && !point.contains(word) ) {
              point = new String(newLetters);
              if (point.contains(word) && word.length()<=point.length()) {

                  break;
              } else {
                  count++;
                  newLetters.append(newLetters);

              }
          }
     if(point.contains(word))
                  System.out.println(count);

          else
              System.out.println(-1);


        }
    }
}