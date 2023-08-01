package collections2;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= 1000; i++) {
            int RandomNumber = rnd.nextInt(50)+1;
            hashSet.add(RandomNumber);
            System.out.println(hashSet);
        }
        System.out.println();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i <= 1000; i++){
            int randomNumber = rnd.nextInt(50)+1;
            linkedHashSet.add(randomNumber);
            linkedHashSet.remove(50);
            System.out.println(linkedHashSet);
        }
        System.out.println(linkedHashSet.contains(50));
        System.out.println();
        Set<Integer> treeSet = new TreeSet<>();
        for(int i = 0; i <=1000; i++){
            int randomNumber = rnd.nextInt(50)+1;
            treeSet.add(randomNumber);
            System.out.println(treeSet);
        }
    }
}