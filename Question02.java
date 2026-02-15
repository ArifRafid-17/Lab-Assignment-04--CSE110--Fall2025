//Question02

import java.util.Scanner;

public class Question02 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number of students to check: ");
     int std_num= sc.nextInt();

   for(int i = 1; i <= std_num; i++) {
         System.out.print("Enter student ID: ");
         int id = sc.nextInt();

         boolean dang = false;

            
       for (int j = 0; j <=30; j++) { 
          int power = 1;
          for (int k = 0; k < j; k++) {
             power *= 2;
             }

          if (power == id) {
             dang = true;
             break;
            }
           }

            if (dang)
                System.out.println("Lucky ID");
            if(dang==false)
                System.out.println("Not Lucky");
    }
  }
}
