package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
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
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StreamEx6 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20),
                new Person("David", 35),
                new Person("Eva", 28)
        );

        // 1. 나이순으로 정렬
        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        System.out.println("Sorted by age: " + sortedByAge);

        // 2. 이름으로 그룹화
        Map<String, List<Person>> groupedByName = people.stream()
                .collect(Collectors.groupingBy(Person::getName));
        System.out.println("Grouped by name: " + groupedByName);
    }
}
