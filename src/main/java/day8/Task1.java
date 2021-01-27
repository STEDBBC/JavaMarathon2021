package day8;

import java.util.Calendar;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String string = " ";
        for (int i = 0; i <= 20000; i++) {
            string+=i+" ";
        }System.out.print(string);
        long totalTime = System.currentTimeMillis()-startTime;
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(totalTime);
        int second = cal.get(Calendar.MILLISECOND);
        System.out.println("\n Время на первый цикл: "+second+" Милисекунд");

        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }
        System.out.print(sb.toString());
        long totalTime2 = System.currentTimeMillis()-startTime2;
        Calendar cal2 = Calendar.getInstance();
        cal2.setTimeInMillis(totalTime2);
        int second2 = cal2.get(Calendar.MILLISECOND);
        System.out.println("\n Время на второй цикл: "+second2+" милисекунд");
    }
}
