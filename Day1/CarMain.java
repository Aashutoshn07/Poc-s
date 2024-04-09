class Car{
    int wheel;
    String model;
    Car(int wheel){
        this.wheel = wheel;
        System.out.println("The car has "+wheel+" wheels");
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car dzire = new Car(4);
        dzire.setModel("xz23rebcik20");
        System.out.println("The model number of car is: "+dzire.getModel());
    }
}
