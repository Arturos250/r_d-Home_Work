package abstraction;

public class Student extends School{

    @Override
    public void description() {
        descriptionOfTheStudent("Ivan", "Gelemaban", 21);
    }
    private void descriptionOfTheStudent(String name, String surname, int age){
        student Ivan = new student();
        Ivan.setAge(age);
        Ivan.setName(name);
        Ivan.setSurname(surname);;
        System.out.println(Ivan);
    }

    private class student{
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
            return "student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}
