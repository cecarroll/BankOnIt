
import java.util.Scanner;

class Customer extends User implements HasMenu{
        private CheckingAccount checking;
        private SavingsAccount savings; 

    public Customer(){ 
        System.out.println("Checking Account Created");
        userName = "a";
        PIN = "0000";
        this.checking = new CheckingAccount();
        this.savings = new SavingsAccount();
    }
    public Customer(String userName, String PIN){ 
        System.out.println("Customer Created");
        this.userName = userName;
        this.PIN = PIN;
        this.checking = new CheckingAccount();
        this.savings = new SavingsAccount();
    }
    public void changePIN(){
        String response;
        Scanner input = new Scanner(System.in);
        System.out.printf("Here is the menu to change your PIN. %nYour current PIN is: %s %nWhat would you like your new PIN to be?%n", getPIN());
        response = input.next();
        setPIN(response);
        System.out.printf("Your new PIN is: %s %n", getPIN());
    }
    public void start (){
        boolean keepGoing = true;
        String response;
        Scanner input = new Scanner(System.in);
        while(keepGoing){
            response = menu();
            if(response.equals("0")){
                keepGoing = false;
                System.out.println("It's so Joever.");
        }else if(response.equals("1")){
            System.out.println("Here is your checking account.");
            checking.start();
        }else if(response.equals("2")){
            System.out.println("Here is your savings account.");
            savings.start();
        }else if(response.equals("3")){
            changePIN();
            
        }else{
            System.out.println("Hmmmm.. That doesn't seem like an option.");
        }
        }
    }
    
    public String menu(){
        Scanner input = new Scanner(System.in);
        String value;
        System.out.printf("Customer Menu: %n %n0) Exit %n1) Manage Checking Account %n2) Manage Savings Account %n3) change PIN %n");
        value = input.next();
        return value;
    } 
    public static void main(String[] args ) {
        Customer a = new Customer();
        a.start();

    }


}
        
            
        

