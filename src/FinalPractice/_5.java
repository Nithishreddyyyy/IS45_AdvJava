package FinalPractice;

import java.util.*;

class Person {
    String name; int age;
    Person(String name, int age) {
        this.name = name; this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.age - p2.age;
    }
}
public class _5{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        Collections.sort(people, new AgeComparator());

        Iterator<Person> it = people.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
    }

}
