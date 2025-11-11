
import java.util.Scanner;


abstract class User implements HasMenu{
    String userName;
    String PIN;
    
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public String getPIN(){
        return PIN;
    }
    public void setPIN(String PIN){
        this.PIN = PIN;
    }
    public void login(){
        boolean keepGoing = true; 
        double value; 
        String userNameTemp;
        String PINTemp;
        Scanner input = new Scanner(System.in);
        while (keepGoing){
        System.out.printf("User Login Menu %n Type your User Name, Please :) %n :)");
        userNameTemp = input.next();
            if (userNameTemp == getUserName()){
                System.out.printf("Thanks for your User Name, %s", userNameTemp);
                System.out.printf("Please type your 4-digit password PIN now. %n");
                PINTemp = input.next();
                if (PINTemp == getPIN()){
                    System.out.printf("Thanks for your PIN %s", userNameTemp);
                    
                }else{
                System.out.println("PIN does not match our records, try again");
                input.nextLine();
                } 
            } else {
                System.out.println("Username not found, try again");
                input.nextLine();
            } 
        }
    }
}