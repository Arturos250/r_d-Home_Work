package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
        try {
            System.out.println("Please enter a number");
            int i = sc.nextInt();
            break;
        }catch (InputMismatchException e) {
            System.out.println("You have not entered a number, please enter a number");
            System.out.println("------------");
            sc.nextLine();
        }
        }
        sc.close();
    }
}
