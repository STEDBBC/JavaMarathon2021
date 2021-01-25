package day6;

public class Task1 {
    public static void main(String[] args) {
        Car sedan = new Car();
        sedan.setYear(2000);
        sedan.info();
        System.out.println(sedan.yearDifference(1998));
        Motorbike myBike1 = new Motorbike("Черная", "Хонда", 2005);
        myBike1.info();
        System.out.println(myBike1.yearDifference(2001));
    }

}
