package oop_parth2;

public class Truck extends Car {
    @Override
    public void Truck_Car() {
        super.Truck_Car();
        System.out.println("Hello from Child Truck()");
    }

    public static void main(String[] args) {
        Truck volvo = new Truck();
        volvo.Beep();
        volvo.Truck_Car();
    }
}
