class MyObject implements Cloneable {
    private int value;

    public MyObject(int value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class MyClass implements Cloneable {
    private int number;
    private MyObject obj;

    public MyClass(int number, MyObject obj) {
        this.number = number;
        this.obj = obj;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        MyClass cloned = (MyClass) super.clone();
        cloned.obj = (MyObject) obj.clone(); // Perform deep copy for obj
        return cloned;
    }

    public int getNumber() {
        return number;
    }

    public MyObject getObj() {
        return obj;
    }

    public void setObj(MyObject obj) {
        this.obj = obj;
    }
}

public class DeepClone {
    public static void main(String[] args) {
        MyObject originalObj = new MyObject(100);
        MyClass original = new MyClass(10, originalObj);

        try {
            MyClass cloned = (MyClass) original.clone();

            System.out.println("Original Object: Number=" + original.getNumber() + ", Obj Value=" + original.getObj().getValue());
            System.out.println("Cloned Object: Number=" + cloned.getNumber() + ", Obj Value=" + cloned.getObj().getValue());

            // Modify the cloned object to demonstrate deep cloning
            cloned.getObj().setValue(200);

            System.out.println("Modified Cloned Object: Number=" + cloned.getNumber() + ", Obj Value=" + cloned.getObj().getValue());
            System.out.println("Original Object: Number=" + original.getNumber() + ", Obj Value=" + original.getObj().getValue());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
