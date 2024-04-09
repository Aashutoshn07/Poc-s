public class Sphere {
    int radius;
    double xCenter;
    double yCenter;
    double zCenter;

    Sphere() {
        radius = 1;
    }

    Sphere(double xCenter, double yCenter, double zCenter) {
        this();
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.zCenter = zCenter;
    }
    Sphere(int radius, double xCenter, double yCenter, double zCenter){
        this(xCenter, yCenter, zCenter);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Sphere [radius=" + radius + ", xCenter=" + xCenter + ", yCenter=" + yCenter + ", zCenter=" + zCenter
                + "]";
    }
}
