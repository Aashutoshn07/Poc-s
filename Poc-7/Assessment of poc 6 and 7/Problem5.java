public class Problem5 {
    public static void main(String[] args) {
        try {
            validateAge(17);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
            // e.printStackTrace();
        }
    }

    public static void validateAge(int age) {
        if (age >= 18) {
            System.out.println("Age Validate Successfully.");
        } else {
            throw new IllegalArgumentException("Age must be 18 or above. ");
        }
    }
}
