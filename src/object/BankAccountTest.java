package object;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.displayInfo();
        account.deposit(10000);
        account.withdraw(2000);

        account.userName = "java";
        account.password = "123";

        account.logIn("java","123");
        account.signUp("Nicolae","Nick","321",5000);
        System.out.println("______+++++++_____");
        //New Bank account

        BankAccount java1 = new BankAccount();
        System.out.println(java1.isLoggedIn);
        java1.signUp("Dima","Flower","white",555);
        java1.logIn("Flower","white");







    }
}
