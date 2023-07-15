package lessonInterface;

public class Pilot extends Man{
    @Override
    public void fly() {
        super.fly();
    }

    public Pilot(String name, String surname, int age, float experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.experience = experience;
    }

    private String name;
    private String surname;
    private int age;
    private float experience;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}
