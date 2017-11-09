public class Account {
    private double balance;
    private String name;
    private long acctNum;

    public Account(double initBal, String owner, long number){
        this.balance=initBal;
        this.name=owner;
        this.acctNum=number;
    }
    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount){
        if(amount<=this.balance){
            this.balance-=amount;
        }else{
            System.out.println("Insufficient funds in bank account!");
        }
    }
    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount){
        this.balance+=amount;
    }
    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance(){
        return this.balance;
    }
    //----------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //----------------------------------------------
    public String toString(){
        return this.name+", "+this.acctNum+", "+this.balance;
    }
    //----------------------------------------------
    // Deducts $10 service fee
    //----------------------------------------------
    public double chargeFee(){
        this.balance-=10;
        return this.balance;
    }
    //----------------------------------------------
    // Changes the name on the account
    //----------------------------------------------
    public void changeName(String newName){
        this.name=newName;
    }
}