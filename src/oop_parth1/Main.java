package oop_parth1;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Artur", "Cherniak", 11, 18);
        Lecture lecture = new Lecture();
        lecture.setName("Misha");
        lecture.setSurname("Sabov");
        lecture.setAge(30);
        lecture.setStudent(student.getName() + student.getSurname());
        lecture.setStudent(student.getName() + (" ") + (student.getSurname()));
        System.out.println("Student: " + student.getName() + (" ") + (student.getSurname()) + ". Age: " + student.getAge());
        System.out.println("Teacher: " + lecture.getName() + " " + (lecture.getSurname()) +
                ". Age: " + lecture.getAge() + ". Student: " + lecture.getStudent());


    }
}
