package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividend = sc.nextDouble();
        double divisor = sc.nextDouble();
        double result;
        if (divisor != 0) {
            result = dividend / divisor;
            System.out.println(result);
        }
    }
}
