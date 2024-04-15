package Problem_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarSpeedExceptionTest {
    public static void main(String[] args) throws SpeedException, IOException {
        int speed = 0;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Speed of the car: ");
            speed = Integer.parseInt(reader.readLine());

            if (speed >= 60 && speed <= 100) {
                throw new VeryFastException();
            } else if (speed >= 20 && speed <= 30) {
                throw new VerySlowException();
            } else {
                System.out.println("The car is running at a speed of " + speed);
            }
        } catch (VeryFastException e) {
            System.out.println(e);
        } catch (VerySlowException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println("IOException occurred");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input!");
        }
    }

}
