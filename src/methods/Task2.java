package methods;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        stars();
    }
    public static void stars (){
        Scanner sc = new Scanner(System.in);
        int  num_of_stars = sc.nextInt();
        for(int i = 0; i < num_of_stars; i++){
            System.out.print("*");
        }
    }
}
