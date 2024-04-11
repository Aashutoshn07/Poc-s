package Problem_4;

public class StringOperation {
    private String strVar;

    public StringOperation(String strVar) {
        this.strVar = strVar;
    }

    public String getStrVar() {
        return strVar;
    }

    public void removeTrailingSpaces() {
        // Remove trailing spaces using replaceAll() method
        strVar = strVar.replaceAll("\\s+$", "");
    }
}
