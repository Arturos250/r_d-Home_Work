package arrays;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(11);
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for(int j = 0; j < array.length;j++){
        if( max < array[j] ) {
        max = array[j];
            }
        }
        System.out.println();
        System.out.print(" Max num is : " + max);

        int min = array[0];
        for(int k = 0; k < array.length;k++){
            if( min > array[k] ) {
                min = array[k];
            }
        }
        System.out.println();
        System.out.print(" Min num is : " + min);

        int mid = 0;
        for (int d : array){
            mid += d;
        }
        System.out.println();
        System.out.println("Arithmetic mean :" + mid / array.length);

        int sum = 0;
        for (int m : array){
            sum += m;
        }
        System.out.println();
        System.out.println("The sum of all numbers :" + sum);
    }
}
