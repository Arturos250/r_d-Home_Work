package methods;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println(number());
    }
    public static int number(){
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     return num * num * num;
    }
}

