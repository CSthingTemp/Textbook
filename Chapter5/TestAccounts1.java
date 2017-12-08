import java.util.Scanner;
public class TestAccounts1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        Account[] testAcct = new Account[num];
        for(int i=0; i<num; i++){
            testAcct[i] = new Account(100, "Name" , i);
            System.out.println("\nCreated account " + testAcct);
            System.out.println("Now there are " + Account.getNumAccounts() + " accounts");
        }
        Account consolidated = Account.consolidate(testAcct[1],testAcct[2]);
        System.out.println(consolidated);
    }
}