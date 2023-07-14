package lessonInterface;

public class Main {
    public static void main(String[] args) {
        Man MichaelSchumacher = new Driver("Michael", "Schumacher", 54, 50);
        MichaelSchumacher.drive();
        System.out.println(MichaelSchumacher);
        System.out.println();
        Man CharlesLindbergh = new Pilot("Charles", "Lindbergh", 112, 96 );
        CharlesLindbergh.fly();
        System.out.println(CharlesLindbergh);
    }
}
