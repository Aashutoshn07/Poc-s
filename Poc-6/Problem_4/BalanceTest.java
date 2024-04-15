package Problem_4;

public class BalanceTest {
    public static void main(String[] args) {
        Balance balance = new Balance();
        try {
            // set the balance using setter method of balance class Print the balance in the
            // console using getter method of balance class.
            balance.setBal(5000);
            System.out.println("Account balance is: " + balance.getBal());

            // Call the withdraw method passing a higher value then the present balance.
            balance.withdraw(6000);

        }

        catch (NoSufficientFundException e) {

            System.out.println(e);

        } finally {

            // Print the available balance in the console using getter method of balance
            // class.
            System.out.println("Now, The Account balance is: " + balance.getBal());
        }
    }
}
