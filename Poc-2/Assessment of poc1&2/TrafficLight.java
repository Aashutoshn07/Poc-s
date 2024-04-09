public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String initialColor, int initialDuration) {
        color = initialColor;
        duration = initialDuration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 60);

        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());

        trafficLight.changeColor("green");
        System.out.println("Changed color to green.");
        System.out.println("Current color: " + trafficLight.getColor());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());
    }
}
