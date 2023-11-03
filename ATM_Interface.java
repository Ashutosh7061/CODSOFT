import java.util.Scanner;
public class ATM_Interface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your initial amount to deposit:");
        double initialAmt=sc.nextDouble();
        ATM a=new ATM(initialAmt);

       System.out.println("Enter -1 for withdraw, 1 for deposit, 5 for checking balance and 0 for ending");
       int option=sc.nextInt();
  
       do {
          switch(option) {
             case 5:
             a.checkbalance();break;
             case 1:
             System.out.println("Enter Amount to deposit");
             int depositAmt=sc.nextInt();
             a.deposit(depositAmt);break;
             case -1:
             System.out.println("Enter Amount to withdraw");
             int withdrawAmt=sc.nextInt();
             a.withdraw(withdrawAmt);break;
             case 0:
             a.end();
             break;
             default:
             System.out.println("Invalid input");}
    
             System.out.println("Enter -1 for withdraw, 1 for deposit, 5 for checking balance and 0 for ending");
             option=sc.nextInt();
           }
       while(option!=0);

           while(option!=0) {
               if(option==0)
               a.end();
               else if(option==1) {
               System.out.println("Enter Amount to deposit");
               int depositAmt=sc.nextInt();
               a.deposit(depositAmt);
             }
               
              else if(option==-1) {
              System.out.println("Enter Amount to withdraw");
              int withdrawAmt=sc.nextInt();
              a.withdraw(withdrawAmt);
             }
               
              else if(option==5)
              a.checkbalance();
              else
              System.out.println("Invalid input");
            }
  
           System.out.println("Thank you.Come Again.");
  
         }
 
       }

  class ATM{
 
        double balance;
        public ATM(double balance)
        {
          this.balance=balance;
        }
        
        public void withdraw (double amt1){
        if(balance>amt1) {
            balance=balance-amt1;
            System.out.println("Money left: "+(balance));
        }
        else
           System.out.println("Withdrawl amount is greater than balance. Therefore invalid.");
        }
        
        public void deposit(double amt2){
          balance=balance+amt2;
          System.out.println("Total amount: "+(balance));
        }
        
        public void checkbalance() {
           System.out.println("The balance is: "+balance);
       }
 
       public void end() {
          System.out.println("Transaction Successful");
     }
  }