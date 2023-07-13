package oop_parth3;

import java.util.Objects;

public class TelephoneParent {
    private String model;
    private String series;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    static int i = 0;

    static {
        System.out.println("1 static method");
    }

    {
        System.out.println("2 not a static method");
    }

    public TelephoneParent(String model) {
        this.model = model;
        System.out.println("3 Constructor with one parameter");
    }

    public TelephoneParent(String model, String series) {
        this.model = model;
        this.series = series;
        System.out.println("4 Constructor with two parameters");
    }

    public TelephoneParent(String model, String series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
        System.out.println("5 Constructor with three parameters");
    }

    public String toString(){
        return model + " " + series + " " + " " + year;
    }

    {
        i++;
        System.out.println("Hello everyone, we have " + i + " Telephones now");
    }

    @Override
    public boolean equals(Object o) {
        if (!(this == o)) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneParent telephoneParent = (TelephoneParent) o;
        return year == telephoneParent.year && model.equals(telephoneParent.model) && series.equals(telephoneParent.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, year);
    }
}
