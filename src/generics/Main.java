package generics;

import oop_parth2.Car;

public class Main {
    public static void main(String[] args) {
        Pair<String,Number> test1 = new Pair<>("Something", 18);
        Pair<Double, Integer> test2 = new Pair<>(20.3d, 30);
        System.out.println(test1.getFirst());
        System.out.println(test2.getFirst());

        System.out.println(test1.getSecond());
        System.out.println(test2.getSecond());
    }
}
