package oop_parth3;

public class Xiaomi extends TelephoneParent{
    public Xiaomi(String model) {
        super(model);
    }

    public Xiaomi(String model, String series) {
        super(model, series);
    }

    public Xiaomi(String model, String series, int year) {
        super(model, series, year);
    }

    public static void main(String[] args) {
        TelephoneParent xiaomi1 = new Xiaomi("Xiaomi");
        TelephoneParent xiaomi2 = new Xiaomi("Xiaomi", "9Pro");
        TelephoneParent xiaomi3 = new Xiaomi("Xiaomi", "9Pro", 2020);
        System.out.println("hashCode: " + xiaomi1.equals(xiaomi2));
        System.out.println("equals: " + xiaomi2.hashCode());
        System.out.println("Just output to the console: " + xiaomi3);
    }
}
