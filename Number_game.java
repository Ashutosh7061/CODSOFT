import java.util.Scanner;

public class Number_game {
     public static void main(String[] args) {
  
        int x=0;
        Scanner sc=new Scanner(System.in);
  
     // To generate the Random number b/t 1 to 100
     //The random number generated will be commented in real code.
     //But here is it not, to show that the code is working perfectly.

        do {
          int randomNumber=(int)(1+Math.random()*100); 
    
    //  System.out.println(randomNumber);
  
          System.out.println("You will only get maximum 10 chances");
          System.out.println("Guess the random generated number");
          int input=sc.nextInt();
          int chances=1;
  
          if(input==randomNumber)
          System.out.println("Bravo!!!..The guessed number is correct.");
  
          while(input!=randomNumber ) {
             if(input>randomNumber)
                 System.out.println("Try again..!!..Your input is high");
             else
                 System.out.println("Try again..!!..Your input is low");
             if(chances>=10) {
                 chances++;
                 break;
             }
   
  
    
           System.out.println("Guess the random generated number");
           input=sc.nextInt();
           chances++;
           }
  
           int score=5;
           switch(chances) {
           case 1: 
           score=10; break;
           case 2:
           case 3:
           score=8; break;
           case 4:
           case 5:
           score=6; break;
           case 6:
           case 7:
           score=4; break;
           case 8:
           case 9:
           score=2; break;
           case 10:
           score=1; break;
           default:
           score=0;
          }
           
            System.out.println("Your score is: "+score);
  
            System.out.println("Do you want to play the game again? Type 1 for yes 0 for No");
            x=sc.nextInt();
         }
          while(x==1);
 
          System.out.println("Thank you for playing !!!");
         sc.close(); 
     }
}