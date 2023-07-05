package oop_parth3;

public class Samsung extends TelephoneParent{


    public Samsung(String model) {
        super(model);
    }

    public Samsung(String model, String series) {
        super(model, series);
    }

    public Samsung(String model, String series, int year) {
        super(model, series, year);
    }

    public static void main(String[] args) {
        TelephoneParent samsung1 = new Samsung("Samsung", "S22");
        TelephoneParent samsung2 = new Samsung("Samsung", "S22", 2022);
        TelephoneParent samsung3 = new Samsung("Samsung");
        System.out.println("Just output to the console: " + samsung1);
        System.out.println("equals: " + samsung2.equals(samsung1));
        System.out.println("hashCode: " + samsung3.hashCode());
    }
}
