import java.util.Scanner;

public class Account{
    public static void main(String[] args){
         double previousBalance, charges;
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter your previous balance: ");
         previousBalance=scan.nextDouble();
         System.out.println("Enter your charges: ");
         charges=scan.nextDouble();
         
         System.out.println("CS CARD International Statem`ent");
         System.out.println("===============================");
         System.out.println("Previous Balance:      $" + previousBalance);
         System.out.println("Additional Charges:    $" + charges);
         
         double newBalance = previousBalance+charges; //total
         double interest;
         if(previousBalance==0){
             interest=0;
         }else{
             interest=.02*newBalance;
         }
         System.out.println("Interest:              $" + interest);
         System.out.print("New Balance:           $");
         newBalance+=interest;
         System.out.println(newBalance);
         
         double payment;
         if(newBalance<50){
             payment=newBalance;
         }else if(newBalance<=300){
             payment=50;
         }else{
             payment=newBalance*.2;
         }
         
         System.out.println("Minimum Payment:       $" + payment);
    }
}
