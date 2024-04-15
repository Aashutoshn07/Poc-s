public class IllegalStateExceptionDemo {
    static void throwIllegalException() {
        try {
            throw new IllegalStateException("MyException");
        } catch (IllegalStateException e) {
            System.out.println("caught:" + e);
        }

    }

    public static void main(String[] args) {
        throwIllegalException();
    }
}
