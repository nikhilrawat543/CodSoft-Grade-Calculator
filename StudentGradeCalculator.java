import java.util.Scanner;

public class StudentGradeCalculator
{
   public static void main(String[] args)
   {
      float[] marks = new float[5];
      float sum=0, avg;
      int i;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter Marks Obtained in 5 Subjects: ");
      for(i=0; i<5; i++)
         marks[i] = scan.nextFloat();
      
      for(i=0; i<5; i++)
         sum = sum + marks[i];
      avg = sum/5;
      System.out.println("Average of Student in 5 Subjects : "+avg);
      System.out.print("Grade of Student : ");
	  
      if(avg>=94)
         System.out.println("A");
      else if(avg>=90 && avg<94)
         System.out.println("A-");
      else if(avg>=87 && avg<90)
         System.out.println("B+");
      else if(avg>=83 && avg<87)
         System.out.println("B");
      else if(avg>=80 && avg<83)
         System.out.println("B-");
      else if(avg>=77 && avg<80)
         System.out.println("C+");
      else if(avg>=73 && avg<77)
         System.out.println("C");
      else if(avg>=70 && avg<73)
         System.out.println("C-");
      else if(avg>=67 && avg<70)
         System.out.println("D+");
      else if(avg>=63 && avg<67)
         System.out.println("D");
      else if(avg>=60 && avg<63)
         System.out.println("D-");
      else
         System.out.println("F");
   }
}