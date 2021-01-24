package day5;

public class Task1 {
    public static void main(String[] args) {
        Car volksWagen = new Car();
        volksWagen.setColor("Черный");
        volksWagen.setModel("Тигуан");
        volksWagen.setYear(2019);
        System.out.println("Машина " + volksWagen.getModel() + " цвет " + volksWagen.getColor() + " " + volksWagen.getYear() + " года");
    }
}

class Car {
    private String color;
    private String model;
    private int year;

    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String carModel) {
        model = carModel;
    }

    public String getModel() {
        return model;
    }

    public void setYear(int carYear) {
        year = carYear;
    }

    public int getYear() {
        return year;
    }
}