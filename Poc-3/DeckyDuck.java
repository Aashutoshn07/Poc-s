class DeckyDuck extends Duck {
    static {
        System.out.println("DeckyDuck: Static block 1");
    }

    static {
        System.out.println("DeckyDuck: Static block 2");
    }

    {
        System.out.println("DeckyDuck: Non-static block 1");
    }

    {
        System.out.println("DeckyDuck: Non-static block 2");
    }

    public DeckyDuck(Flyable flyable, Quackable quackable) {
        super(flyable, quackable);
        System.out.println("DeckyDuck: Constructor");
    }

    @Override
    void swim() {
        System.out.println("DeckyDuck: Swim");
    }
}


