package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike myBike = new Motorbike("Красная","Хонда",2005);
        System.out.println(myBike.getColor()+" "+myBike.getModel()+" "+myBike.getYear());
    }
}

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
    public Motorbike (String color, String model, int year){
        this.color=color;
        this.model=model;
        this.year=year;
    }
}