package Problem_3;

public class Problem_3 {

    public static void f() throws Ex1, Ex2, Ex3 {
        throw new Ex2("Exception Ex2 thrown from f method");
    }

    public static void g() throws Ex1 {
        try {
            f();
        } catch (Ex1 e1) {
            System.out.println("Ex1 caught");
        } catch (Ex2 e2) {
            System.out.println("Ex2 caught");
            throw new Ex1("Ex1 exception thrown from Ex2 catch block");
        } catch (Ex3 e3) {
            System.out.println("Ex3 caught");
            throw new Ex1("Ex1 exception thrown from Ex3 catch block");
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Ex1 e) {
            System.out.println("Caught Ex1 exception in main: " + e.getMessage());
        }
    }
}
