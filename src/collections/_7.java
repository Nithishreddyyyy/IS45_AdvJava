package collections;
import java.util.*;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + "(" + age  +")";
    }
}
class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.age - p2.age;
    }
}
class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person P1 = new Person("Nithish",20);
        Person P2 = new Person("Pranav",40);
        people.add(P1);
        people.add(P2);
        Collections.sort(people, new AgeComparator());
        System.out.println(people);
    }
}
