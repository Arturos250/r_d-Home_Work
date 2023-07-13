package oop_parth3;

public class IphoneModel extends TelephoneParent {

    public IphoneModel(String model) {
        super(model);
    }

    public IphoneModel(String model, String series) {
        super(model, series);
    }

    public IphoneModel(String model, String series, int year) {
        super(model, series, year);
    }

    public static void main(String[] args) {
        TelephoneParent iphoneModel1 = new IphoneModel("Iphone");
        TelephoneParent iphoneModel2 = new IphoneModel("Iphone", "XS");
        TelephoneParent iphoneModel3 = new IphoneModel("Iphone", "XS", 2018);
        System.out.println("hashCode: " + iphoneModel1.hashCode());
        System.out.println("equals: " + iphoneModel2.equals(iphoneModel1));
        System.out.println("Just output to the console: " + iphoneModel3);
    }
}
