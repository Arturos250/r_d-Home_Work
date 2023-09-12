package multithreading2;

import java.util.Random;
import java.util.concurrent.*;

public class Task1 {
        public static void main(String[] args) {
            Thread numberGeneratorThread = new Thread(() -> {
                Random rnd = new Random();
                while (true) {
                    int randomNumber = rnd.nextInt(10);
                    System.out.println(randomNumber);
                    if (randomNumber == 5) {
                        break;
                    }
                }
            });
            numberGeneratorThread.start();

            Callable<Integer> randomGenerator = () -> {
                Random rnd = new Random();
                return rnd.nextInt(50) + 1;
            };
            ExecutorService executorService = Executors.newFixedThreadPool(10);
            for (int i = 0; i < 10; i++) {
                Future<Integer> future = executorService.submit(randomGenerator);
                try {
                    int res = future.get();
                    System.out.println(res);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            executorService.shutdown();
        }
    }
