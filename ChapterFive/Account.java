public class Account{
    private double balance;
    private String name;
    private int acctNum;
    private static int numAccounts=0;
    private static int numDeposits;
    private static int numWithdrawals;
    private static int totalDeposits;
    private static int totalWithdrawals;
    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, int number){
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts++;
    }
    
    public static int getNumAccounts(){
        return Account.numAccounts;
    }
    
    public void close(){
        this.name="CLOSED";
        this.balance=0;
        Account.numAccounts--;
    }
    
    public static Account consolidate(Account a1, Account a2){
        if(a1.getName().equals(a2.getName()) && a1.getAcctNum()!=a2.getAcctNum()){
            a1.close();
            a2.close();
            return new Account(a1.getBalance()+a2.getBalance(),a1.getName(),a1.getAcctNum());
        }
        return null;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAcctNum(){
        return this.acctNum;
    }
    
    public static int getNumDeposits(){
        return Account.numDeposits;
    }
    
    public static int getTotalDeposits(){
        return Account.totalDeposits;
    }
    
    public static int getNumWithdrawals(){
        return Account.numWithdrawals;
    }
    
    public static int getTotalWithdrawals(){
        return Account.totalWithdrawals;
    }
    
    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            Account.totalWithdrawals+=amount;
            Account.numWithdrawals++;
        }else
            System.out.println("Insufficient funds");
    }
    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount){
        balance += amount;
        Account.totalDeposits+=amount;
        Account.numDeposits++;
    }
    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance(){
        return balance;
    }
    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString(){
        String statement= "";
        statement = "Name: " + this.name + "\tAccount Number: " + this.acctNum + "\tBalance: " + this.balance;
        return statement;
    }
    //----------------------------------------------
    // Deducts $10 service fee
    //----------------------------------------------
    public double chargeFee(){
        return this.balance -= 10;
    }
    //----------------------------------------------
    // Changes the name on the account
    //----------------------------------------------
    public void changeName(String newName) {
        this.name = newName;
    }
}