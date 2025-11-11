
import java.util.Scanner;

public class SavingsAccount extends CheckingAccount{
    private double interestRate;

 public void setInterestRate(double interestRate){ 
        this.interestRate = interestRate;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public double calcInterest(){
        double interest = (interestRate + 1) * getBalance() ;
        return interest;
    }

    public static void main(String[] args ) {
        SavingsAccount a = new SavingsAccount();
        System.out.println(a.getBalance());
        a.setBalance(12.00);
        a.checkBalance();
        a.makeDeposit(33);
        
        a.setInterestRate(.12);
        System.out.println(a.getInterestRate());
        a.start();
        a.checkBalance();
    }
}