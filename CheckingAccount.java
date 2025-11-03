import java.util.Scanner;

public class CheckingAccount implements HasMenu{
    private double balance;
    private boolean keepGoing;
    Scanner input = new Scanner(System.in);

    public CheckingAccount(){ 
        System.out.println("Checking Account Created");
        balance = 0;
    }
    public CheckingAccount(double balance){ 
        System.out.println("Checking Account Created");
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
            System.out.println("Try a little less.")
        }
        System.out.println(String.format("Your new balance is: %s", getBalanceString()));
    }
    public void start (){
        keepGoing = true;
        menu();
    }
    public void menu(){
        double value; 
        while (keepGoing){
        System.out.printf("Account Menu %n Choose a Menu Option: %n 0) quit %n 1) check balance %n 2) make a deposit %n 3) make a withdrawal %n ");
        value = getdouble();
            if(value == 0){

                else if(value == 1){


                }else if(value == 2){


                }else if(value == 3){

                }else{


                }
            }
        }
    }
    public double getDouble(){
        boolean isDouble = true;
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
    }

    
}


