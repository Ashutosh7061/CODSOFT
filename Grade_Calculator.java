import java.util.*;
public class Grade_Calculator {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks obtained");
    System.out.print("Enter Mark 1:");
    int m1=sc.nextInt();
    System.out.print("Enter Mark 2:");
    int m2=sc.nextInt();
    System.out.print("Enter Mark 3:");
    int m3=sc.nextInt();
    System.out.print("Enter Mark 4:");
    int m4=sc.nextInt();
    System.out.print("Enter Mark 5:");
    int m5=sc.nextInt();
    
    int sum=(m1+m2+m3+m4+m5);
    System.out.println("The total Marks obtained out of 500 is :"+sum);
    
    float avg=(sum/5);
    System.out.println("The average percentage is:"+avg);
    
    
    if(avg>=95.0) {
      System.out.println("The grade obtained is: O");
    }
    else if(avg<95.0 && avg>=90.0) {
      System.out.println("The grade obtained is: A");
    }
    else if(avg<90.0 &&avg>=80.0) {
      System.out.println("The grade obtained is: B");
    }
    else if(avg<80.0 &&  avg>=70.0) {
      System.out.println("The grade obtained is: C");
    }
    else if(avg<70.0 && avg>=60) {
      System.out.println("The grade obtained is: D");
    }
    else {
      System.out.println("You scored very less to show.");
    }
    
    
    
    
  }

}