package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            if (num2==0)
                break;
            double result = num1/num2;
            System.out.println(result);
        }
    }
}
