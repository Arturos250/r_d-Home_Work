package multithreading;

public class Task1 {
    public static void main(String[] args) {
        Thread thread1 = new NumberPrinter("Thread 1: ");
        Thread thread2 = new NumberPrinter("Thread 2: ");

        thread1.start();
        thread2.start();
    }
}

class NumberPrinter extends Thread {
    public NumberPrinter(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
