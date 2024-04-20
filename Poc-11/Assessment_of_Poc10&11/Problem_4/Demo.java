package Problem_4;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Car implements Runnable {
    private String name;
    private int currentPosition;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.currentPosition = 0;
        this.speed = speed;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void run() {
        Random random = new Random();
        while (currentPosition < 1000) { // Race distance is 1000 units
            currentPosition += speed + random.nextInt(20); // Vary speed slightly
            System.out.println(name + " is at position " + currentPosition);
            try {
                Thread.sleep(100); // Delay for visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " has finished the race!");
    }
}

public class Demo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // Three cars in the race

        Car car1 = new Car("Car 1", 20); // Speed of 20 units per iteration
        Car car2 = new Car("Car 2", 25); // Speed of 25 units per iteration
        Car car3 = new Car("Car 3", 30); // Speed of 30 units per iteration

        executor.execute(car1);
        executor.execute(car2);
        executor.execute(car3);

        executor.shutdown();
    }
}
