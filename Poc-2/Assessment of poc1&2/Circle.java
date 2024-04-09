public class Circle {
    private int radius;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double areaOfCircle(int radius){
        return Math.PI * radius * radius ;
    }
    
    public double circumferenceOfCircle(int radius){
        return 2 * Math.PI * radius;
    }
}
