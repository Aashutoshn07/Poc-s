import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.out.println("Provide input.");
            return;
        }
        String username = console.readLine("Enter username: ");
        char[] passwordChars = console.readPassword("Enter Password: ");
        String password = String.valueOf(passwordChars);

        if("admin".equals(username)&&"Secret".equals(password)){
            console.printf("Welcome to Java Application, %s. \n", username);
            java.util.Arrays.fill(passwordChars, ' ');
        }else{
            console.printf("Invalid Cedantials!");
        }
    }

}