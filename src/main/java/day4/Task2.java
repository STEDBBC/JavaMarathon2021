package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        int min, max;
        int zeronum = 0;
        int zeroresult = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10001);
        }
        min = max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] % 10 == 0){
                zeroresult= zeroresult+numbers[i];
                zeronum++;}

        }
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + zeronum);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + zeroresult);
    }
}
