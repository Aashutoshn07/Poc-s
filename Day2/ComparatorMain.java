import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    public static Comparator<Person> nameComparator = Comparator.comparing(Person::getName);

    public static Comparator<Person> ageComparatorDesc = Comparator.comparingInt(Person::getAge).reversed();
}

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people);
        System.out.println("Sorted by age (natural ordering):");
        printPeople(people);

        Collections.sort(people, Person.nameComparator);
        System.out.println("\nSorted by name:");
        printPeople(people);

        Collections.sort(people, Person.ageComparatorDesc);
        System.out.println("\nSorted by age in descending order:");
        printPeople(people);
    }

    public static void printPeople(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
