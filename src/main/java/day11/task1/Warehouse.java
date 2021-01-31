package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    public void  addOrders(){
        countPickedOrders++;
           }
    public void addDelivery(){
        countDeliveredOrders++;
    }
    @Override
    public String toString() {
        return countPickedOrders + ", "+ countDeliveredOrders;
    }
}
