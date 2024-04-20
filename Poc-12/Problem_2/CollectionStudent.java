package Problem_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Riyaz", 90));
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        students.add(new Student("David", 95));
        students.add(new Student("Emma", 88));
        students.add(new Student("Frank", 82));
        students.add(new Student("Grace", 91));
        students.add(new Student("Henry", 79));
        students.add(new Student("Ivy", 87));
        students.add(new Student("Jack", 93));

        Student highestMarksStudent = students.stream()
                .max(Comparator.comparingInt(Student::getMarks))
                .orElse(null);

        System.out.println("Students with higher marks: ");
        if (highestMarksStudent != null) {
            System.out.println("Name: " + highestMarksStudent.getName());
            System.out.println("Marks: " + highestMarksStudent.getMarks());
        } else {
            System.out.println("No student found.");
        }

        Student leastMarksStudent = students.stream()
                .min(Comparator.comparingInt(Student::getMarks))
                .orElse(null);
        System.out.println("Student with least marks: ");
        if (leastMarksStudent != null) {
            System.out.println("Name: " + leastMarksStudent.getName());
            System.out.println("Marks: " + leastMarksStudent.getMarks());
        } else {
            System.out.println("No student found.");
        }
    }
}
