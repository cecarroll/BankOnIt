public class CheckingAccount {
    private double balance;

    public CheckingAccount(){ 
        System.out.println("Checking Account Created");
        balance = 0;
    }
    public CheckingAccount(double balance){ 
        System.out.println("Checking Account Created");
        this.balance = balance;

    }
    public double getBalance(){
        return balance;
    }
    public String getBalanceString(){
        String balanceString = String.valueOf(balance);
        
        return balanceString;
    }

    public static void main(String[] args ) {
        CheckingAccount a = new CheckingAccount();
        CheckingAccount b = new CheckingAccount(12.99);
        CheckingAccount c = new CheckingAccount(3.50);
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());
        System.out.println("You've got " + c.getBalanceString());
    }

    
}


