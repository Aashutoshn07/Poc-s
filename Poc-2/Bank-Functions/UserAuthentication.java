import java.util.Scanner;

public class UserAuthentication {
    private Bank bank;
    private Scanner scanner;

    public UserAuthentication(Bank bank) {
        this.bank = bank;
        this.scanner = new Scanner(System.in);
    }

    public boolean login() {
        System.out.println("Welcome to the banking application");
        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        return bank.authenticateUser(accountNumber, password);
    }
}
