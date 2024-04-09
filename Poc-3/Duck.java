abstract class Duck {
    Flyable flyable;
    Quackable quackable;

    static {
        System.out.println("Duck: Static block 1");
    }

    static {
        System.out.println("Duck: Static block 2");
    }

    {
        System.out.println("Duck: Non-static block 1");
    }

    {
        System.out.println("Duck: Non-static block 2");
    }

    public Duck(Flyable flyable, Quackable quackable) {
        this.flyable = flyable;
        this.quackable = quackable;
        System.out.println("Duck: Constructor");
    }

    abstract void swim();
}
