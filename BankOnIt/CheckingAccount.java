
import java.util.Scanner;

public class CheckingAccount implements HasMenu{
    private double balance;
    private boolean keepGoing;
    

    public CheckingAccount(){ 
        System.out.println("Account Created");
        balance = 0;
    }
    public CheckingAccount(double balance){ 
        System.out.println("Account Created");
        this.balance = balance;

    }
    public void setBalance(double balance){ 
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public String getBalanceString(){
        String balanceString = String.valueOf(balance);
        return balanceString;
    }
        public void checkBalance(){
        System.out.println("Checking Account Balance: " + getBalance());
    }
    public void makeDeposit(double balance){
        System.out.println(String.format("Your previous balance was: %s", getBalanceString()));
        this.balance = this.balance + balance; 
        System.out.println(String.format("Your new balance is: %s", getBalanceString()));
    }
    public void makeWithdrawal(double withdrawal){
        System.out.println(String.format("Your previous balance was: %s", getBalanceString()));
        if(withdrawal < this.balance){
            this.balance = this.balance - withdrawal; 
        }else {
            System.out.println("Try a little less.");
        }
        System.out.println(String.format("Your new balance is: %s", getBalanceString()));
    }
    public void start (){
        keepGoing = true;
        String response;
        double value;
        while(keepGoing){
            response = menu();
            if(response.equals("0")){
                keepGoing = false;
                System.out.println("It's so Joever.");
        }else if(response.equals("1")){
            checkBalance();
        }else if(response.equals("2")){
            System.out.println("How much would you like to deposit?");
            value = getDouble();
            makeDeposit(value);
        }else if(response.equals("3")){
            System.out.println("How much would you like to withdrawal?");
            value = getDouble();
            makeWithdrawal(value);
        }else{
            System.out.println("Hmmmm.. That doesn't seem like an option.");
        }
        }
    }

    public String menu(){
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Account Menu %n Choose a Menu Option: %n 0) quit %n 1) check balance %n 2) make a deposit %n 3) make a withdrawal %n ");
        String value = input.next(); 
        return value;
    }
    
    public double getDouble(){
        Scanner input = new Scanner(System.in);
        boolean isDouble = true;
        double value = 0;
        while (isDouble) {
            System.out.print("Enter a number: ");
            if (input.hasNextDouble()) {  
                value = input.nextDouble();
                isDouble = false;                      
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                input.next();
            }
        }
        return value;
    }
    public static void main(String[] args ) {
        CheckingAccount a = new CheckingAccount();
        CheckingAccount b = new CheckingAccount(12.99);
        CheckingAccount c = new CheckingAccount(3.50);
        System.out.println(a.getBalance());
        System.out.println(b.getBalance());
        System.out.println("You've got " + c.getBalanceString());
        a.setBalance(12.00);
        a.checkBalance();
        a.makeDeposit(33);
        b.makeWithdrawal(2);
        a.start();
        a.checkBalance();
    }
    

}

