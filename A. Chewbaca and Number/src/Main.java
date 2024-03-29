import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String num = input.next();
        StringBuilder newNum = new StringBuilder();
        if (num.length() < 2)
            System.out.println(num);
        else {
            for (int i = 0; i < num.length() ; i++) {


                if (i > 0) {

                if(Integer.parseInt(String.valueOf( num.charAt(i)) )> Integer.parseInt(String.valueOf( '9' - num.charAt(i)) )) {


                            newNum.append('9' - num.charAt(i));

                    }
                   else newNum.append(num.charAt(i));
                }
                else
                {
                    if(Integer.parseInt(String.valueOf( num.charAt(i)) )> Integer.parseInt(String.valueOf( '9' - num.charAt(i)) )) {
                        if (Integer.parseInt(String.valueOf('9' - num.charAt(i))) != 0)
                            newNum.append('9' - num.charAt(i));
                        else newNum.append(num.charAt(i));
                    }
                    else  newNum.append(num.charAt(i));

                }


            }
            System.out.println(newNum);
        }
    }
}