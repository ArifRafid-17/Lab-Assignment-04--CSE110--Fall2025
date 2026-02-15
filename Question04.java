//Question04

import java.util.Scanner;
public class Question04{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Number of Members:");
    int member=sc.nextInt();
    int i=0;
    int exercise;
    double sum=0;
    double naverage=0;
    double avg=0;
       while(i<member){
          System.out.print("Exercises for Member "+(i+1)+":");
          exercise=sc.nextInt();
          System.out.print("Exercise 1:");
          int exercise1=sc.nextInt();
           System.out.print("Exercise 2:");
          int exercise2=sc.nextInt();
           System.out.print("Exercise 3:");
          int exercise3=sc.nextInt();
          sum=exercise1+exercise2+exercise3;
          if(exercise1>350){
              sum=sum+(exercise1*0.5);
          }
          if(exercise2>350){
             sum=sum+(exercise2*0.5);
           }
           if(exercise3>350){
             sum=sum+(exercise3*0.5);
           }
          naverage=sum/3;
          if(naverage>400){
              sum=sum+(50*3);
           }
         avg=sum/3;
         if(exercise1<200 && exercise2<200 && exercise3<200){
             avg=avg-(avg*10)/100;
          }
          System.out.println("Average calories earned per day for Member "+(i+1)+" : "+avg);
           if(exercise>=4){
              System.out.println("Over exercise");
         }
          exercise1=0;
          exercise1=0;
         exercise1=0;
         sum=0;
          avg=0;
       naverage=0;
       i++;
     }
  }
}
