package files2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {
        public static void main(String[] args) {
            Path filePath = Paths.get("file.txt");

            if (Files.exists(filePath)) {
                readFromFile(filePath);
            } else {
                writeToFile(filePath, "test text");
            }
        }

        private static void writeToFile(Path filePath, String content) {
            try {
                Files.write(filePath, content.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static void readFromFile(Path filePath) {
            try {
                byte[] contentBytes = Files.readAllBytes(filePath);
                String content = new String(contentBytes);
                System.out.println("Text from file: " + content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
