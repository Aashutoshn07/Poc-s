package Problem_6;

public class MyExceptionHandler {

    public static void main(String[] args) {
        try {
            // Create a object of MyExceptionHandler
            MyExceptionHandler myExceptionHandler = new MyExceptionHandler();
            // Now call the throwMe() method of MyExceptionHandler class using the above
            // object.
            myExceptionHandler.throwMe();

        } catch (MyException e) {
            // Print appropriate messages regarding Exception in the console.
            System.out.println("MyException: " + e);

        }
    }

    public void throwMe() throws MyException {
        try {
            // Call the doIt() method of the class.
            doIt();
        } catch (MyChildException e) {
            throw new MyException(e.getMessage() + " -And I got It");
        }
    }

    public void doIt() throws MyChildException {
        throw new MyChildException("Exception From Child!");
    }
}