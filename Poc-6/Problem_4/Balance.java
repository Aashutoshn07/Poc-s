package Problem_4;

public class Balance {
    private int bal;

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public void withdraw(int amt) throws NoSufficientFundException {
        if (bal >= amt) {
            bal -= amt;
        } else {
            throw new NoSufficientFundException("Insufficient balance! "+amt);
        }
    }
}
