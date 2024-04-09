class MolarDuck extends Duck {
    static {
        System.out.println("MolarDuck: Static block 1");
    }

    static {
        System.out.println("MolarDuck: Static block 2");
    }

    {
        System.out.println("MolarDuck: Non-static block 1");
    }

    {
        System.out.println("MolarDuck: Non-static block 2");
    }

    public MolarDuck(Flyable flyable, Quackable quackable) {
        super(flyable, quackable);
        System.out.println("MolarDuck: Constructor");
    }

    @Override
    void swim() {
        System.out.println("MolarDuck: Swim");
    }
}