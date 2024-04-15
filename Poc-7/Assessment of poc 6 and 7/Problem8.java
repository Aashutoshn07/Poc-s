

public class Problem8 {
    public static void main(String[] args) {
        try{
            int age = -5;
            if(age < 0){
                throw new InvalidAgeException("Age Cannot be negative.");
            }
            System.out.println("Age is valid: "+age);
        }catch(InvalidAgeException e){
            System.out.println("InvalidAgeException caught: "+ e.getMessage());
        }
    }
}
class InvalidAgeException extends Exception{
    public InvalidAgeException (String message){
        super(message);
    }
}
