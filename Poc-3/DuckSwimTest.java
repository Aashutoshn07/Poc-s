public class DuckSwimTest {
    public static void main(String[] args) {
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Flying");
            }
        };

        Quackable quackable = new Quackable() {
            @Override
            public void quack() {
                System.out.println("Quacking");
            }
        };

        Duck deckyDuck = new DeckyDuck(flyable, quackable);
        Duck molarDuck = new MolarDuck(flyable, quackable);

        deckyDuck.swim();
        molarDuck.swim();
    }
}
