import java.util.Scanner;
public class ProcessTransactions{
    public static void main(String[] args){
        Account acct1, acct2;           //two test accounts
        String keepGoing = "y";         //more transactions?
        String action;                  //deposit or withdraw
        double amount;                  //how much to deposit or withdraw
        int acctNumber;                 //which account to access
        Scanner scan = new Scanner(System.in);
        //Create two accounts
        acct1 = new Account(1000, "Sue", 123);
        acct2 = new Account(1000, "Joe", 456);
        System.out.println("The following accounts are available:\n");
        System.out.println(acct1);
        System.out.println(acct2);
        
        while(keepGoing.toLowerCase().equals("y")){
            //get account number, what to do, and amount
            System.out.print("\nEnter the number of the account you would like to access (123 or 456): ");
            acctNumber = scan.nextInt();
            System.out.print("Would you like to make a deposit (D) or withdrawal (W)? ");
            action = scan.next();
            System.out.print("Enter the amount: ");
            amount = scan.nextDouble();
            if (amount > 0){
                if (acctNumber == acct1.getAcctNum()){
                    if (action.toLowerCase().equals("w"))
                        acct1.withdraw(amount);
                    else if (action.toLowerCase().equals("d"))
                        acct1.deposit(amount);
                    else
                        System.out.println("Sorry, invalid action.");
                }else if (acctNumber == acct2.getAcctNum()){
                    if (action.toLowerCase().equals("w"))
                        acct2.withdraw(amount);
                    else if (action.toLowerCase().equals("d"))
                        acct2.deposit(amount);
                    else
                        System.out.println("Sorry, invalid action.");
                }else
                    System.out.println("Sorry, invalid account number.");
            }else
                    System.out.println("Sorry, amount must be > 0.");
            System.out.print("\nMore transactions? (y/n)");
            keepGoing = scan.next();
        }
        System.out.println();
        //Print number of deposits
        System.out.println(Account.getNumDeposits());
        //Print number of withdrawals
        System.out.println(Account.getNumWithdrawals());
        //Print total amount of deposits
        System.out.println(Account.getTotalDeposits());
        //Print total amount of withdrawals
        System.out.println(Account.getTotalWithdrawals());
    }
}