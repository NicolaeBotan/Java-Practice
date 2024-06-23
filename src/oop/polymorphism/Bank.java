package oop.polymorphism;

public class Bank extends Branch{
    @Override
    public void deposit(){
        System.out.println("Deposit at Bank");
    }
    @Override
    public void loan(){
        System.out.println("Loan from Bank up to 5M");
    }
    public void openBranch(){
        System.out.println("Bank is opening a Branch ");
    }

}
