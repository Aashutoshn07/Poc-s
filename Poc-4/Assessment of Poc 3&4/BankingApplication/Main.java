package BankingApplication;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        BankAccount account1 = new BankAccount(123456, 10000.0);
        BankAccount account2 = new BankAccount(789012, 15000.0);

        bank.addBankAccount(account1);
        bank.addBankAccount(account2);

        double totalBalance = bank.getTotalBalance();
        System.out.println("Total amount in Bank: " + totalBalance);
    }
}
