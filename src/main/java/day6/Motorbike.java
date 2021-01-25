package day6;


class Motorbike {
    private String color;
    private String model;
    private int year;

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getColor (){
        return color;
    }
    public String getModel(){
        return model;
    }

    public int getYear() {
        return year;
    }
    public Motorbike(String color, String model, int year){
        this.color=color;
        this.model=model;
        this.year=year;
    }
    void info() {
        System.out.println("Этот Мотоцикл");
    }
    int yearDifference(int inputYear) {
        int difference = year - inputYear;
        return Math.abs(difference);
    }

}