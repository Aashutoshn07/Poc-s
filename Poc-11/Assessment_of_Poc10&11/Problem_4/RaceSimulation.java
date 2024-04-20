package Problem_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RaceSimulation {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Car car1 = new Car("Car 1", 20);
        Car car2 = new Car("Car 2", 25);
        Car car3 = new Car("Car 3", 30);

        executor.execute(car1);
        executor.execute(car2);
        executor.execute(car3);

        executor.shutdown();
    }
}
