package streamAPI;

import java.security.cert.CertPath;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> StudentList = new ArrayList<>();
        StudentList.add(new Student("Cherniak", 8.8f));
        StudentList.add(new Student("Popovich", 7));
        StudentList.add(new Student("Bilous", 10.1f));
        StudentList.forEach(student -> System.out.println(student.getSurname() + " " + student.getAverageScore()));
        System.out.println("---------------");
        List<Student> sortedBySurname = StudentList.stream()
                .sorted(Comparator.comparing(Student::getSurname))
                .collect(Collectors.toList());
        sortedBySurname.forEach(student -> System.out.println(student.getSurname() + " " + student.getAverageScore()));
        System.out.println("---------------");
        List<Student> sortedByAverageScore = StudentList.stream()
                .sorted(Comparator.comparing(Student::getAverageScore))
                .collect(Collectors.toList());
        sortedByAverageScore.forEach(student -> System.out.println(student.getAverageScore() + " " + student.getSurname()));
    }

}
