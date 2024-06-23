package oop.polymorphism;

public class ATM implements Money{

    public void withdraw(){
        System.out.println("Withdraw from ATM");
    }
    public void deposit(){
        System.out.println("Deposit at ATM");
    }
    public void checkInfo(){
        System.out.println("INFO at ATM");
    }
    public void loan(){
        System.out.println("ATM Loans");
    }
}
