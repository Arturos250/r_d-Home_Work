package oop_parth2;

public class BMW extends Car{
    @Override
    public void PassengerCar() {
        super.PassengerCar();
    }

    public static void main(String[] args) {
        BMW x6 = new BMW();
        x6.PassengerCar();
    }
}
