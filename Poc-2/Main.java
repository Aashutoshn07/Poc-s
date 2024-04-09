public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[20]; // Array of Student objects

        // Initialize students with unique roll numbers and names
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i + 1, "Student " + (i + 1));
        }

        // Print details of each student
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
