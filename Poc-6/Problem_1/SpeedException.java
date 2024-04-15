package Problem_1;

public class SpeedException extends Exception {
    @Override
    public String toString() {
        return "VeryFastException : The car is moving with a dangerous speed ";
    }
}