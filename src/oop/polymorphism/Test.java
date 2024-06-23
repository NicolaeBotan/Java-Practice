package oop.polymorphism;

public class Test {
    public static void main(String[] args) {

        //JUST FROM LOOKING AT METHODS YOU CAN NOT REALLY SAY WHAT THE METHOD IS COMING FROM
        //ONLY DURING THE RUN TIME JAVA WILL PICK THE METHOD DEPENDING ON HOW IT WAS CALLED/BY
        //WHICH OBJECT WAS CALLED.
        //OVERRIDING THE METHODS IS AN EXAMPLE OF DYNAMIC POLYMORPHISM

        ATM atm = new ATM();
        //atm will be able to see only ATM class functionalities

        atm.deposit();//Deposit at ATM
        atm.checkInfo();//INFO at ATM
        atm.withdraw();//Withdraw from ATM

        Branch branch = new Branch();
        //branch will be able to see Branch and ATM functionalities since is a Child of ATM class.

        branch.deposit();//Deposit at Branch
        //this deposit method was called from Branch class, where was Overridden

        branch.loan();//Branch Loan is up to 500K
        branch.creditCard();//Card from Branch

        Bank bank = new Bank();
        //bank Object will be able to see Bank, Branch and ATM functionalities since is a Child of
        // ATM and Branch classes.

        bank.deposit();//Deposit at Bank
        bank.openBranch();//Bank is opening a Branch
        bank.loan();//Loan from Bank up to 5M
        bank.creditCard();//Card from Branch

        bank.checkInfo();//INFO at ATM
        //THIS METHOD IS COMING ALL THE WAY FROM ATM CLASS , GRAND PARENT.

        ATM atm1 = new Branch();//ATM datatype
       // atm1.loan(); ATM is the parent, so it can NOT do the Branch methods "loan()"

        //WE CAN FORCE THE PARENT TO ACT LIKE CHILD
        //WE CAN CAST THE PARENT ATM CLASS TO IMPLEMENT THE CHILD METHODS.
        //CASTING

        ((Branch)atm1).loan();//Branch Loan is up to 500K
        //WE ARE FORCING THE ATM TO ACT LIKE THE CHILD BRANCH

        //WE WILL CALL THE INTERFACE
        Money money = new ATM();
        Money money1 = new Branch();
        Money money2 = new Bank();

        money.deposit();//Deposit at ATM
        //MONEY OBJECT IS ACTING LIKE ATM WITHOUT CASTING
        //THIS IS AN EXAMPLE OF POLYMORPHISM

        money1.loan();//Branch Loan is up to 500K

        //money2.openBranch(); not working because there is no reference in the Money Interface about
        //this method openBranch(). But we can cast it.
        //CASTING
        ((Bank)money2).openBranch();//Bank is opening a Branch
        //now THE Money Object is acting like Bank Object when we cast it.









    }
}
