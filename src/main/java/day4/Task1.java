package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int numbers8 = 0;
        int numbers1 = 0;
        int even = 0;
        int odd = 0;
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(11);
            result = result + numbers[i];
        }
        for (int num : numbers) {
            if (num > 8) {
                numbers8++;
            } if (num == 1) {
                numbers1++;
            } if (num % 2 == 0) {
                even++;
            } if (num % 2 != 0) {
                odd++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива : " + numbers.length);
        System.out.println("Колчисетво чисел больше 8: " + numbers8);
        System.out.println("Количество чисел равных 1: " + numbers1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + result);

    }
}
