class Customer implements User{
        private CheckingAccount checking;
        private SavingsAccount savings; 

    public Customer(){ 
    System.out.println("Checking Account Created");
    userName = "a";
    PIN = "0000"
    }
    public Customer(Stirng userName, String PIN){ 
        System.out.println("Customer Created");
        this.userName = userName;
        this.PIN = PIN;
    }
    }