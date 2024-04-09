class Square {
    public float areaOfSquare(float side) {
        return side * side;
    }

    public float perimeterOfSquare(float side) {
        return 4 * side;
    }
}

class Rectangle {
    float areaOfRectangle(float length, float width) {
        return length * width;
    }

    float perimeterOfRectangle(float length, float width) {
        return 2 * (length + width);
    }
}

public class MainClass {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square();

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        System.out.println("Area of Square is: "+square1.areaOfSquare(5.2f));
        System.out.println("Perimeter of Square is: "+square2.perimeterOfSquare(7.9f));

        System.out.println("Area of Rectangle is: "+rectangle1.areaOfRectangle(5.2f, 8.7f));
        System.out.println("Perimeter of Rectangle is: "+rectangle2.perimeterOfRectangle(7.7f, 9.6f));

    }
}
