package Problem_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 90, 85, 95));
        students.add(new Student(2, 85, 90, 80));
        students.add(new Student(3, 95, 80, 90));
        students.add(new Student(4, 80, 95, 85));
        students.add(new Student(5, 90, 85, 90));
        students.add(new Student(6, 85, 90, 85));
        students.add(new Student(7, 95, 80, 95));
        students.add(new Student(8, 80, 95, 80));
        students.add(new Student(9, 90, 85, 95));
        students.add(new Student(10, 85, 90, 80));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getId() != s2.getId()) {
                    return Integer.compare(s1.getId(), s2.getId());
                } else if (s1.getMaths() != s2.getMaths()) {
                    return Integer.compare(s1.getMaths(), s2.getMaths());
                } else {
                    return Integer.compare(s1.getPhysics(), s2.getPhysics());
                }
            }
        });

        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() +
                    ", Maths Marks: " + student.getMaths() +
                    ", Physics Marks: " + student.getPhysics() +
                    ", Chemistry Marks: " + student.getChemistry());
        }
    }
}
