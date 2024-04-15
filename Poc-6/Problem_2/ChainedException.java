package Problem_2;

import java.io.IOException;

public class ChainedException {
    public static void main(String[] args) throws MyException, IOException {
        try {
            int rs = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());

            throw new MyException("Chained ArithematicException");
        }
    }
}
