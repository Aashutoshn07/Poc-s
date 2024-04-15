package Problem_4;

public class NoSufficientFundException extends Exception {
    private String strVar;

    public NoSufficientFundException(String strVar) {
        super();
        this.strVar = strVar;
    }

    @Override
    public String toString() {
        return "NoSufficientFundException: " + strVar;
    }
}
