package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test322");

        printSumDigits(file);

    }

    public static void printSumDigits(File file) {

        Scanner sc = null;
        try {
            sc = new Scanner(file);
            String line = sc.nextLine();
            String[] stringNumbers = line.split(" ");

            int[] numbers = new int[10];
            int counter = 0;
            int result = 0;
            for (String number : stringNumbers) {
                numbers[counter++] = Integer.parseInt(number);
            }
            for (int i = 0; i < numbers.length; i++) {
                result += numbers[i];
            }


            System.out.println(Arrays.toString(numbers));
            System.out.println("sum: " + result);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорреткный входной файл");
        }

    }
}
