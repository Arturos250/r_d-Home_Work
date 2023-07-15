package lessonInterface;

public abstract class Man implements Drive, Fly {
    public void drive() {
        System.out.println("Driver drive");
    }

    public void fly() {
        System.out.println("Pilot flies");
    }
}
