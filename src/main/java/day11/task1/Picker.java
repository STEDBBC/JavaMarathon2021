package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPayed;
    Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return salary + ", " + isPayed;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    @Override
    public void doWork() {
        this.salary += 80;
        warehouse.addOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70_000;
        isPayed = true;
    }
}
