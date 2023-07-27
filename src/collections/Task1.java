package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        Random rnd = new Random();
        for (int i = 0; i <= 10; i++){
            int rn = rnd.nextInt(10);
            arrayList.add(rn);
        }
        System.out.println(arrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int k = 1; k <= 20000; k++){
            linkedList.add(k);
        }
        int number = 9292967;
        int index = linkedList.size() / 2;
        linkedList.add(index, number);
        System.out.println(linkedList);
        System.out.println(linkedList.size());


        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(18, "Arthur", "Cherniak");
        Student student2 = new Student(30, "Roman", "Marchenko");
        Student student3 = new Student(25, "Serhii", "Zhuravlev");
        Student student4 = new Student(28, "Eugene","Bilous");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.remove(1);
        System.out.println(students);
    }
}
