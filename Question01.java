//Question01
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter starting number: ");
      int start = input.nextInt();

      System.out.print("Enter ending number: ");
      int end = input.nextInt();

         for (int i= start; i <= end; i++) {
            int digitcount = 0;
            int temp = i;

           
          while (temp > 0) {
             temp /= 10;
             digitcount++;
          }

         int sum = 0;
         temp = i;

           
          while (temp > 0) {
             int digit = temp % 10;

             int power = 1;

          for (int j = 1; j <= digitcount; j++) {
                 power=power * digit;
              }

              sum =sum+ power;
              temp /= 10;
              }
          if (sum == i) {
             System.out.println(i);
            }
        }
    }
}
