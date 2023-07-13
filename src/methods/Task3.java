package methods;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        symbol();
    }
    public static void symbol(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Який символ ви хочете ввести?");
        int sym = sc.nextInt();
        System.out.println("Скільки разів ви хочете вивести ваш символ?");
        int times = sc.nextInt();
        for (int i = 0; i < times; i++){
            System.out.println(sym);
        }
    }
}