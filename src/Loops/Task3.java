package Loops;

public class Task3 {
    public static void main(String[] args) {
            int num = 7;
            int fact = 1;
            for(int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
}