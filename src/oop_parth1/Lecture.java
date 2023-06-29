package oop_parth1;

public class Lecture {
        public Lecture(String Name, String Surname, int age){
                this.Name = Name;
                this.Surname = Surname;
                this.age = age;
        }
        private String Name;

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                this.Name = Name;
        }

        private String Surname;

        public String getSurname() {
                return Surname;
        }

        public void setSurname(String surname) {
                this.Surname = surname;
        }

        private int age;

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }
}

