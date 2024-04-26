import java.util.HashSet;
import java.util.Iterator;

public class StuentSetDemo {
    public static void main(String[] args) {
        HashSet<Student> studentSet = new HashSet<>(10, 0.75f);

        Student student1 = new Student();
        student1.setStudentName("Alice");
        student1.setMark(85);
        student1.setDob("2000-01-01");
        student1.setCollege("ABC College");

        studentSet.add(student1);

        Student student2 = new Student();
        student2.setStudentName("Bob");
        student2.setMark(90);
        student2.setDob("1999-03-15");
        student2.setCollege("XYZ University");

        studentSet.add(student2);

        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}
