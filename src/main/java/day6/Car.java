package day6;

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

    void info() {
        System.out.println("Этот автомобиль");
    }

    int yearDifference(int inputYear) {
            int difference = year - inputYear;
            return Math.abs(difference);
    }
}
