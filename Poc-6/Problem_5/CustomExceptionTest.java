package Problem_5;

public class CustomExceptionTest {
    public static void main(String[] args) throws NegetiveAgeException {
        int age = 18;
        try {
            // age = -3;
            if (age < 0) {
                throw new NegetiveAgeException(age);
            } else {
                System.out.println("Age entered is " + age+", Thank you.");
            }
        } catch (NegetiveAgeException e) {
            System.out.println(e);
        }
    }
}
