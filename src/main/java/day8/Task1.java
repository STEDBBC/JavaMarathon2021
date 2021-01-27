package day8;

public class Task1 {
    public static void main(String[] args) {

        for (int i = 0; i <= 20000; i++) {
            System.out.printf("%d ", i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        System.out.print(sb.toString());
    }
}
