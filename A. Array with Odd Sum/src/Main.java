import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cases= input.nextInt();
        while (cases-->0) {
            int size = input.nextInt();
            int[] arr=new int[size];
            int numSum = 0;
            int evenCount=0;
            int oddCount=0;
            for (int i = 0; i < size; i++) {
                arr[i]=input.nextInt();
                if(arr[i]%2==0) evenCount++;
                else oddCount++;
            }
          if(oddCount==size &&size%2==0 ||evenCount==size)
          {
              System.out.println("NO");
          }
          else System.out.println("YES");



            }
        }

    }
