package oop_parth2;

public class Passenger_car extends Car {
    @Override
    public void Passenger_Car() {
        super.Passenger_Car();
        System.out.println("Hello from Child Passenger Car()");
    }

    public static void main(String[] args) {
        Passenger_car BMW = new Passenger_car();
        BMW.Passenger_Car();
        BMW.Beep();
    }
}
