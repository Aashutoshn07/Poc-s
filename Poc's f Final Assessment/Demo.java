class A {
    public void m1() {
        System.out.println("m1 for A");
    }

    public void m2() {
        System.out.println("M2 for A");
    }
}

class B extends A {
    public void m1() {
        System.out.println("m1 for B");
    }

    public void m3() {
        System.out.println("M3 for B");
    }
}

class C extends B {

}

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        A ab = new B();
        B b = new B();
        C c = (C)b;
        c.m1();
        // B (B)bb = new A();


        ab.m1();
        ab.m2();
        b.m2();

    }
}
