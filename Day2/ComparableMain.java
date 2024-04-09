import java.util.ArrayList;
import java.util.Collections;

// A class representing a person
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

    // Implementing Comparable interface to define natural ordering based on age
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}

public class ComparableMain {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sorting based on natural ordering (age)
        Collections.sort(people);
        System.out.println("Sorted by age (natural ordering):");
        printPeople(people);
    }

    // Helper method to print list of persons
    public static void printPeople(ArrayList<Person> people) {
        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
