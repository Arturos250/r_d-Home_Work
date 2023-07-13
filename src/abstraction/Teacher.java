package abstraction;

public class Teacher extends School{
    private String SubjectTeacher;

    public Teacher(String subjectTeacher) {
        SubjectTeacher = subjectTeacher;
    }

    @Override
    public void description() {
        descriptionOfTheLecturer("Larisa", "Stepanova", 80);
    }
    private void descriptionOfTheLecturer(String name, String surname, int age){
        Lecturer Larisa = new Lecturer();
        Larisa.setName(name);
        Larisa.setSurname(surname);
        Larisa.setAge(age);
        System.out.println(Larisa);
        System.out.println("The teacher teaches a " + SubjectTeacher + " lesson");
    }
    private class Lecturer{
        private int age;
        private String name;
        private String surname;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Lecturer{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}
