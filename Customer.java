import java.util.Scanner;

class Customer extends User{
        private CheckingAccount checking;
        private SavingsAccount savings; 

    public Customer(){ 
    System.out.println("Checking Account Created");
    userName = "a";
    PIN = "0000"
    }
    public Customer(String userName, String PIN){ 
        System.out.println("Customer Created");
        this.userName = userName;
        this.PIN = PIN;
    }
    public void start (){
        keepGoing = true;
        while(keepGoing){
            response = menu();
            if(value == 0){
                keepGoing = false;
                System.out.println("It's so Joever.");
        }else if(value == 1){
            checkBalance();
        }else if(value == 2){
            System.out.println("How much would you like to deposit?");
            value = getDouble();
            makeDeposit(value);
        }else if(value == 3){
            System.out.println("How much would you like to withdrawal?");
            value = getDouble();
            makeWithdrawal(value);
        }else{
            System.out.println("Hmmmm.. That doesn't seem like an option.");
        }
        }
    }

    
    public String menu(){
    
    System.out.printf("Customer Menu: %n %n0) Exit %n1) Manage Checking Account %n2) Manage Savings Account %n3) change PIN");
    value = getDouble();
    return value;
    } 
    
}
        
            
        

}