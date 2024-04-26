 package comparable.comparator;

class Employees {

    int eno;
    String ename;
    public Employees(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }
    public int getEno() {
        return eno;
    }
    public void setEno(int eno) {
        this.eno = eno;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    @Override
    public String toString() {
        return "Employees [eno=" + eno + ", ename=" + ename + "]";
    } 
     
    
}