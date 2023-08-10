package streamAPI;

import java.util.Comparator;
import java.util.Objects;

public class Student{
        private String surname;
        private float averageScore;

    public Student(String surname, float averageScore) {
        this.surname = surname;
        this.averageScore = averageScore;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
}
