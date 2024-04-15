package Problem_7;

import java.io.IOException;
import java.util.Scanner;

public class UserExceptionDemo {
    public static void main(String[] args) {
        try {
            String tempName = "";
            System.out.println("Enter your name:");
            // Assume reading input from console
            // For simplicity, we'll use a dummy value "nacre" here
            tempName = "nacre";
            String name = "nacre";

            if (!name.equals(tempName)) {
                throw new MyException("Hi.. " + tempName);
            } else {
                System.out.println("Welcome to NACRE");
            }
        } catch (MyException e) {
            System.out.println(e);
        } // catch (IOException e) {
          // System.out.println("IOException occurred: " + e.getMessage());
          // }
    }
}