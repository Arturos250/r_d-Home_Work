package abstraction;

public class Main {
    public static void main(String[] args) {
        School Student1 = new Student();
        Student1.description();
        School Teacher1 = new Teacher("Math");
        Teacher1.description();
    }
}
