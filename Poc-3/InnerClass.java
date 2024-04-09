public class InnerClass {
    private RectArea area;

    public InnerClass(int length, int breadth) {
        area = new RectArea(length, breadth); 
    }

    public RectArea getArea() {
        return area;
    }

    public class RectArea {
        private int length;
        private int breadth;

        public RectArea(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int calculateArea() {
            return length * breadth;
        }
    }

    public static void main(String[] args) {
        InnerClass inner = new InnerClass(5, 10); 
        InnerClass.RectArea areaObj = inner.getArea(); 

        int area = areaObj.calculateArea(); 
        System.out.println("Area of rectangle: " + area);
    }
}
