import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount("John Doe", 5000);
        bank.addAccount("Jane Smith", 10000);

        UserAuthentication userAuth = new UserAuthentication(bank);
        if (userAuth.login()) {
            Account account = bank.getAccount(1001);
            account.deposit(2000);
            account.withdraw(500);
            account.applyForLoan(5000);
            account.checkBalance();
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
    }
}
