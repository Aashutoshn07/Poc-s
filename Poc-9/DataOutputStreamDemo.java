import java.io.*;

public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try {
            // FileOutputStream fileOutputStream = new FileOutputStream("index3.txt");

            // DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            // int rollNo1 = 101;
            // String studentName1 = "Naresh";
            // int studentAge1 = 24;
            // String studentCourse1 = "Java";
            // float courseFee1 = 2999.77f;

            // dataOutputStream.writeInt(rollNo1);
            // dataOutputStream.writeUTF(studentName1);
            // dataOutputStream.writeInt(studentAge1);
            // dataOutputStream.writeUTF(studentCourse1);
            // dataOutputStream.writeFloat(courseFee1);
            // dataOutputStream.flush();
            // dataOutputStream.close();
            // System.out.println("Data stored!");

            FileInputStream fileInputStream = new FileInputStream("index3.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            while (true) {
                try {

                    int irollno = dataInputStream.readInt();
                    String istudentName = dataInputStream.readUTF();
                    int istudentAge = dataInputStream.readInt();
                    String istudentCourse1 = dataInputStream.readUTF();
                    float icourseFee1 = dataInputStream.readFloat();

                    System.out.println(irollno);
                    System.out.println(istudentName);
                    System.out.println(istudentAge);
                    System.out.println(istudentCourse1);
                    System.out.println(icourseFee1);
                    dataInputStream.close();

                } catch (Exception e) {
                    // System.out.println(e);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
