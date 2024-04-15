package Problem_1;

public class VeryFastException extends Exception {
    @Override
    public String toString() {
        return "VeryFastException: The car is moving with a dangerous speed";
    }
}
