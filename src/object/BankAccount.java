package object;

public class BankAccount {
    /*
    New Class : BankAccount
    variables:
    - accountHolderName, bankName, balance,userName,password,isLoggedIn
    Methods:
    - void displayInfo()--> will print out all account information
    - double deposit()--> one parameter to update the balance
    - double withdraw()--> one parameter to update the balance
    - void logIn()--> userName,password parameters to update isLoggedIn boolean
     */
    String accountHolderName, bankName, userName, password;
    double balance;
    boolean isLoggedIn;//false by default

    //create a method that will initialize the instance fields
    // void signUp()
    public void displayInfo() {
        if (isLoggedIn) {
            System.out.println("Bank name - " + bankName);
            System.out.println("Account Holder name - " + accountHolderName);
            System.out.println("Balance - $" + balance);
            System.out.println("Is Logged In = " + isLoggedIn);
        } else {
            System.out.println("Should be LoggedIn first to see info");
        }
    }

    public double deposit(double add1) {
        balance += add1;
        System.out.println("Your balance after depositing - $" + add1 + " is = $" + balance);
        return balance;
    }

    public double withdraw(double sub1) {
        balance -= sub1;
        System.out.println("Your balance after withdrawal is = $" + balance);
        return balance;
    }

    public void logIn(String user, String pass) {

        if (userName.equals(user) && password.equals(pass)) {
            isLoggedIn = true;
            System.out.println("User is Logged In");
            System.out.println("INFORMATION AFTER LOGIN -----");
            displayInfo();
        } else {
            isLoggedIn = false;
            System.out.println("Incorrect UserName or Password");
        }
    }

    public void signUp(String accountHolderName1, String userName1, String password1, double balance1) {

        accountHolderName = accountHolderName1;
        userName = userName1;
        password = password1;
        balance = balance1;
        System.out.println("SignUp process is done.");

    }

}
