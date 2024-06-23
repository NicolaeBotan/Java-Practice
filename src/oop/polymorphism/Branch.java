package oop.polymorphism;

public class Branch extends ATM{

    @Override
    public void deposit (){
        System.out.println("Deposit at Branch");
    }
    public void loan(){
        System.out.println("Branch Loan is up to 500K");
    }
    public void creditCard(){
        System.out.println("Card from Branch");
    }

}
