package Problem_7;


public class Student {
    private int id;
    private int maths;
    private int physics;
    private int chemistry;

    public Student(int id, int maths, int physics, int chemistry) {
        this.id = id;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public int getId() {
        return id;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    public int getChemistry() {
        return chemistry;
    }
}
