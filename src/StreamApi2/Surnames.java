package StreamApi2;

import java.util.*;
import java.util.stream.Collectors;

public class Surnames {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        List<Person> surnames = new ArrayList<>();
        surnames.add(new Person("Cherniak"));
        surnames.add(new Person("Danyliuk"));
        surnames.add(new Person("Cherniak"));
        surnames.add(new Person("Danyliuk"));
        surnames.add(new Person("Danyliuk"));
        surnames.add(new Person("Marchenko"));
        surnames.add(new Person("Cherniak"));
        surnames.add(new Person("Marchenko"));
        surnames.add(new Person("Marchenko"));
        surnames.add(new Person("Sabov"));
        surnames.add(new Person("Kovalenko"));
        surnames.add(new Person("Kovalenko"));
        surnames.add(new Person("Bondarenko"));
        surnames.add(new Person("Bondarenko"));
        surnames.add(new Person("Bondarenko"));
        surnames.add(new Person("Shevchenko"));
        surnames.add(new Person("Shevchenko"));
        surnames.add(new Person("Shevchenko"));
        surnames.add(new Person("Lysenko"));
        surnames.add(new Person("Lysenko"));
        surnames.add(new Person("Lysenko"));

        Map<String, Integer> surnameCountMap = surnames.stream()
                .collect(Collectors.toMap(Person::getSurname, person -> 1, Integer::sum));

        System.out.println("Surname counts:");
        surnameCountMap.forEach((surname, count) -> System.out.println(surname + " - " + count));
        for (int i = 0; i < 10; i++){
            numbers.add(rnd.nextInt(10));
        }
        System.out.println("Рандомні числа: " + numbers);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сума всіх чисел: " + sum);
    }

    static class Person {
        private String surname;

        public Person(String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }
    }
}
