package Loops;

public class Task4 {
    public static void main(String[] args) {
        int fibo1 = 1;
        int fibo2 = 1;
        int fibo;
        System.out.print(fibo1+ " " +fibo2+ " " );
        for(int i = 3; i <= 11; i++){
            fibo = fibo1 + fibo2;
            System.out.print(fibo + " ");
            fibo1 = fibo2;
            fibo2 = fibo;
    }
 }
}