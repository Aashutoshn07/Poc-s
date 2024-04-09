// i.	Write a program to create ‘Student’ class with rollNo and name as two instance variables.

// ii.	Create two objects student1, student2 for the Student class and assign any appropriate values to the objects. Display the Object content on a Console.
public class Student {
    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Mahi");
        student1.setRollNo(1);
        student2.setName("Varun");
        student2.setRollNo(2);

        System.out.println(
                "The name of first Employee is " + student1.getName() + " and Roll no is : " + student1.getRollNo());
        System.out.println(
                "The name of second Employee is " + student2.getName() + " and Roll no is : " + student2.getRollNo());
    }
}