
public class GenericBank {

    private double bankBalance=1000;

    public void welcome() {
        System.out.println("Welcome to Generic Bank");
    }

    public void deposit(double amount) {
        bankBalance += amount;
        System.out.println("You Depoite is successfully completed of amount: " + amount);
    }
    public void withdraw(double amount){
        bankBalance -=amount;
        System.out.println("Withdraw amount: "+ amount+ " Current Balance: "+ bankBalance);
    }
    public void checkbalance() {
        System.out.println("Your Account balance is: " + bankBalance);
    }
    

}
