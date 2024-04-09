public class Student {
    private static String collegeName = "ABC College"; 
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollegeName() {
        return collegeName;
    }

    public static void setCollegeName(String collegeName) {
        Student.collegeName = collegeName;
    }

    public String toString() {
        return "Student [rollNumber=" + rollNumber + ", name=" + name + ", collegeName=" + collegeName + "]";
    }
}

