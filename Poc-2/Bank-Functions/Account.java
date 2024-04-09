import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private double loanAmount;
    private double loanInterestRate;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.loanAmount = 0;
        this.loanInterestRate = 10; // Default loan interest rate (in percentage)
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void applyForLoan(double amount) {
        if (amount <= (balance + loanAmount * (1 + loanInterestRate / 100))) {
            loanAmount += amount;
            System.out.println("Loan approved: $" + amount);
        } else {
            System.out.println("Loan application rejected");
        }
    }

    public void repayLoan(double amount) {
        if (amount <= balance) {
            loanAmount -= amount;
            balance -= amount;
            System.out.println("Loan repaid: $" + amount);
        } else {
            System.out.println("Insufficient balance to repay the loan");
        }
    }

    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Loan Amount: $" + loanAmount);
        System.out.println("Loan Interest Rate: " + loanInterestRate + "%");
        System.out.println("Monthly Loan Payment: $" + calculateMonthlyLoanPayment());
    }

    private double calculateMonthlyLoanPayment() {
        // Monthly loan payment calculation: (Loan Amount * Monthly Interest Rate) / (1 - (1 + Monthly Interest Rate)^(-Loan Term))
        int loanTermMonths = 12; // Assuming loan term in months
        double monthlyInterestRate = loanInterestRate / 100 / 12; // Monthly interest rate
        double loanPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));
        return loanPayment;
    }

    // Generate a hash for a given password using SHA-256 algorithm
    public String hashPassword(String password) throws NoSuchAlgorithmException {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchAlgorithmException("SHA-256 algorithm not found");
        }
    }

    public boolean authenticatePassword(String password) {
        try {
            return hashPassword(password).equals(accountHolderName); // Simplified authentication for demo
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error: " + e.getMessage());
            return false;
        }
    }
}
