public class StudentInfo {
    private int rollno;
    private String name;
    private String course;
    private String dob;
    private String mobileNo;

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentInfo [rollno=" + rollno + ", name=" + name + ", course=" + course + ", dob=" + dob
                + ", mobileNo=" + mobileNo + "]";
    }

    public String getCourse() {
        return course;
    }

    public String getDob() {
        return dob;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

}
// i. Write a program to create ‘StudentInfo’ class having instance variables as
// follows

// rollNo is a Integer name is a String course is a String dateOfBirth is a
// String mobileNo is a String contactNO is a String
