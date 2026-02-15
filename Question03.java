//Question03


import java.util.Scanner;
public class Question03{
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number of day: ");
  int day= sc.nextInt();
  int count=1;
  for(int i=1; i<=day; i++){
   System.out.println("Enter sales for day "+count+":");
   int p1=sc.nextInt();
   int p2=sc.nextInt();
   int p3=sc.nextInt();
    double sum= p1+p2+p3;
    double tax;
    if(100<=sum && sum<200){
     tax= sum+(sum*0.02);
     System.out.println("Day "+count+" : "+"Total Sales with tax: "+tax);
    }
    else if(200<=sum && sum<500){
    tax= sum+(sum*0.05);
    System.out.println("Day "+count+" : "+"Total Sales with tax: "+tax);
    }
    else if(sum<100){
    System.out.println("Day "+count+" : "+"Total Sales with tax: "+sum);
    }
    else{
    tax= sum+(sum*0.1);
    System.out.println("Day "+count+" : "+"Total Sales with tax: "+tax);
    }
   count++;
   }
  }
}
