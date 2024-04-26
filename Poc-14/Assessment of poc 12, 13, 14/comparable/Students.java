package comparable;

public class Students implements Comparable<Students> {
    int sno;
    String sname;

    public Students(int sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSno() {
        return sno;
    }

    public String getSname() {
        return sname;
    }

    @Override
    public String toString() {
        return "Students [sno=" + sno + ", sname=" + sname + "]";
    }

    @Override
    public int compareTo(Students o) {
        return this.getSname().compareTo(o.getSname());

    }

}