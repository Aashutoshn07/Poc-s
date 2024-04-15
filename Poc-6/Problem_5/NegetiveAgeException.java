package Problem_5;

public class NegetiveAgeException  extends Exception{
    private int age;
    public NegetiveAgeException(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "NegativeAgeException: Age cannot be negative, got: "+ age;
    }
}
