package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane cesna = new Airplane("CessnaInc", 1955, 8, 736);
        cesna.setFuel(0);
        cesna.setYear(1980);
        cesna.setLength(12);
        cesna.fillUP(20);
        cesna.fillUP(150);
        cesna.info();

    }
}

class Airplane {
   private String producer;
   private int year;
   private int length;
   private int weight;
   private int fuel;

    public void setProducer(String airProducer) {
        producer = airProducer;
    }

    public void setYear(int airYear) {
        year = airYear;
    }

    public void setLength(int airLenght) {
        length = airLenght;
    }

    public void setWeight(int airWeight) {
        weight = airWeight;
    }

    public void setFuel(int airFuel) {
        fuel = airFuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    void fillUP(int inputfuel) {
        this.fuel+=inputfuel;
    }

    void info() {
        System.out.println("Изготовитель: " + producer);
        System.out.println("Год выпуска: " + year);
        System.out.println("Длина: " + length);
        System.out.println("Вес " + weight);
        System.out.println("Количество топлива в баке: " + fuel);
    }

}