package collections3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    private String english;
    private String japanese;
    private String deutsch;

    public Task1(String english, String japanese, String deutsch) {
        this.english = english;
        this.japanese = japanese;
        this.deutsch = deutsch;
    }

    public String getEnglish() {
        return english;
    }

    public String getJapanese() {
        return japanese;
    }

    public String getDeutsch() {
        return deutsch;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Task1> Translate = new HashMap<>();
        Translate.put("Привіт", new Task1("Hello","こんにちは","Hallo"));
        Translate.put("Світ", new Task1("World","世界", "Welt"));
        Translate.put("Небо", new Task1("Sky", "空", "Himmel"));
        Translate.put("Дерево" , new Task1("Tree", "木", "Baum"));
        Translate.put("Зошит", new Task1("Copybook", "コピーブック", "Heft"));
        Translate.put("Телефон", new Task1("phone", "電話", "Telefon"));
        Translate.put("Ручка", new Task1("pen", "ペン", "Stift"));
        Translate.put("Лампа", new Task1("lamp", "ランプ", "Lampe"));
        Translate.put("Птах", new Task1("Bird", "鳥", "Vogel"));
        Translate.put("Папка", new Task1("Folder", "フォルダ", "Ordner"));
        System.out.println("Введіть слово Українською");
        String words = sc.nextLine();

        Task1 translate = Translate.get(words);
        if(translate != null){
            System.out.println("Англійський переклад " + translate.getEnglish());
            System.out.println("Японський переклад " + translate.getJapanese());
            System.out.println("Німецький переклад " + translate.getDeutsch());
        }else{
            System.out.println("Нажаль такого слова в словнику ще немає");
        }
    }
}
