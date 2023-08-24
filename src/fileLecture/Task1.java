package fileLecture;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        if (file.exists()){
            readFromFile(file);
        }else {
            writeToFile(file, " ");
        }
    }

    private static void writeToFile(File file, String content){
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(content);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readFromFile(File file){
        StringBuilder stringBuilder = new StringBuilder();
        try(FileReader fileReader = new FileReader(file)){
            int ch;
            while ((ch = fileReader.read()) != -1 ){
                stringBuilder.append((char)ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
