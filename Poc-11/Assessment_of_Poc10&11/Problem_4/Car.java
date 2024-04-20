package Problem_4;

import java.util.Random;

public class Car implements Runnable {
    private String name;
    private int currentPosition;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
        this.currentPosition = 0;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (currentPosition < 1000) {
            currentPosition += speed + random.nextInt(20);
            System.out.println(name + " is at position " + currentPosition);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " has finised the race!");
    }
}
