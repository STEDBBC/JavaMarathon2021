package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int divident = sc.nextInt();
            int divisor = sc.nextInt();
            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            int result = divident / divisor;
            System.out.println(result);
        }
    }
}
