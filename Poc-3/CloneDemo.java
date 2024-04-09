public class CloneDemo implements Cloneable {
    private int number;
    private transient int data; // Marking data as transient

    public CloneDemo(int number, int data) {
        this.number = number;
        this.data = data;
    }

    // Getter and setter methods for number and data

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneDemo{" +
                "number=" + number +
                ", data=" + data +
                '}';
    }

    public static void main(String[] args) {
        // Create the original object
        CloneDemo original = new CloneDemo(10, 20);

        try {
            // Clone the original object
            CloneDemo cloned = (CloneDemo) original.clone();

            // Print the contents of both original and cloned objects
            System.out.println("Original Object: " + original);
            System.out.println("Cloned Object: " + cloned);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}
