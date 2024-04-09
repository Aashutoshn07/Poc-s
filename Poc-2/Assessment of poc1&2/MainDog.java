public class MainDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy", "Bulldog");
        Dog d2 = new Dog("Sujey", "French Bulldog");

        System.out.println(d1.toString());
        System.out.println(d2.toString());

        d1.setName("Rockey");
        d1.setBreed("Labrador Retriever");

        d2.setName("Bruno");
        d2.setBreed("German Shepherd");
        System.out.println();

        System.out.println(d1.toString());
        System.out.println(d2.toString());

    }
}
