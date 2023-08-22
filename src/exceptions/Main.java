package exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Number: ");
            int number = sc.nextInt();
            int square = Calculate(number);
            System.out.println("The square of the number: " + square);
        } catch (NullException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int Calculate(int number) throws NullException {
        if (number < 0) {
            throw new NullException("Number is smaller then null");
        }
        return number * number;
    }
}
