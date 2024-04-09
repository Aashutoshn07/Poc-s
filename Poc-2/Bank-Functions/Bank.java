import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Account> accounts;
    private int nextAccountNumber;

    public Bank() {
        accounts = new HashMap<>();
        nextAccountNumber = 1001;
    }

    public void addAccount(String accountHolderName, double initialBalance) {
        Account account = new Account(nextAccountNumber++, accountHolderName, initialBalance);
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean authenticateUser(int accountNumber, String password) {
        Account account = accounts.get(accountNumber);
        return account != null && account.authenticatePassword(password);
    }
}
