package lessonInterface;

public abstract class Man implements Drive, Fly {
    @Override
    public void drive() {
        System.out.println("The skill of driving");
    }

    @Override
    public void fly() {
        System.out.println("The skill of flying");
    }
}
