public class MainInfo {
    public static void main(String[] args) {
        StudentInfo []studentInfo = new StudentInfo[5];

        studentInfo[0] = new StudentInfo();
        studentInfo[1] = new StudentInfo();
        studentInfo[2] = new StudentInfo();
        studentInfo[3] = new StudentInfo();
        studentInfo[4] = new StudentInfo();

        studentInfo[0].setName("Ashish");
        studentInfo[0].setRollno(1);
        studentInfo[0].setCourse("B.Tech");
        studentInfo[0].setMobileNo("123456");
        studentInfo[0].setDob("01/02/2000");

        studentInfo[1].setRollno(2);
        studentInfo[1].setName("Mahesh");
        studentInfo[1].setCourse("B.Tech");
        studentInfo[1].setMobileNo("123456");
        studentInfo[1].setDob("05/02/2000");

        studentInfo[2].setRollno(3);
        studentInfo[2].setName("Mahi");
        studentInfo[2].setCourse("B.E");
        studentInfo[2].setMobileNo("4123456");
        studentInfo[2].setDob("11/09/1980");

        studentInfo[3].setName("Walter");
        studentInfo[3].setRollno(4);
        studentInfo[3].setCourse("B.Tech");
        studentInfo[3].setMobileNo("9926075423");
        studentInfo[3].setDob("8/05/2000");

        studentInfo[4].setRollno(2);
        studentInfo[4].setName("Skyler");
        studentInfo[4].setCourse("B.Com");
        studentInfo[4].setMobileNo("13223456");
        studentInfo[4].setDob("05/10/2002");

        // System.out.println(studentInfo[]);
        for(int i=0; i<studentInfo.length;i ++){
            System.out.println(studentInfo[i].toString());
        }

    }
}
