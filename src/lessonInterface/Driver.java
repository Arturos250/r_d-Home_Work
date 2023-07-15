package lessonInterface;

public class Driver extends Man{

    @Override
    public void drive() {
        super.drive();
    }

    public Driver(String name, String surname, int year, float experience) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.experience = experience;
    }

    private String name;
    private String surname;
    private int year;
    private float experience;

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", experience=" + experience +
                '}';
    }
}
