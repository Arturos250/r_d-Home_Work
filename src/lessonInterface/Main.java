package lessonInterface;

import javax.management.DescriptorRead;

public class Main {
    public static void main(String[] args) {
        Man driver = new Driver("Michael", "Schumacher", 54, 50);
        driver.drive();
        System.out.println(driver);
        System.out.println();
        Man pilot = new Pilot("Charles", "Lindbergh", 112, 96);
        pilot.fly();
        System.out.println(pilot);
    }
}
