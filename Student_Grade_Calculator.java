import java.util.*;

public class Student_Grade_Calculator
{
   int total_marks=0;
   String grade;
   double average=0.0;
   public void Calculate_Grade()
   {
      Scanner sn=new Scanner(System.in);
      System.out.println("Enter number of subjects");
      int n=sn.nextInt();
      int[] marks=new int[n];
      for(int i=0;i<n;i++)
      {
         System.out.println("Enter marks for subject "+(i+1)+" out of 100:");
         marks[i]=sn.nextInt();
         //using condition to check whether the input marks is out of 100 or not
         if(marks[i]<0||marks[i]>100)
         {
            System.out.println("Invalid Input Please Try Again");
            i--;
            continue;
         }
         total_marks=total_marks+marks[i];


      }
      average=(double)total_marks/n;
      grade=Calculate_Grade(average);
      System.out.println("----RESULT----");
      System.out.println("Total marks: "+total_marks);
      System.out.println("Average Percentage: "+average);
      System.out.println("Grade: "+grade);
    } String Calculate_Grade(double average){
         if (average>=90)
         return "A";
         else if(average>=80)
         return "B";
         else if(average>=70)
         return "C";
         else if(average>=60)
         return "D";
         else if(average>=50)
         return "E";
         else
         return "F";
      }

public static void main(String args[])
{
   System.out.println("Welcome to Student Grade Calculator");
   Student_Grade_Calculator obj=new Student_Grade_Calculator();
   obj.Calculate_Grade();
   System.out.println("Thanks for using Student Grade Calculator.");


}

   }
