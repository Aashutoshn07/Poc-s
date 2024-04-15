package Problem_7;

public class MyException extends Exception {
    private String name = "";

    public MyException() {
        super();
    }

    public MyException(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "MyException: Name isn't matching";
    }
}
