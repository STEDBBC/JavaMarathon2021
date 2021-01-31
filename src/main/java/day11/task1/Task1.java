package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println("Собрано заказов: " + warehouse1.getCountPickedOrders() + "\nДоставлено заказов: " + warehouse1.getCountDeliveredOrders());
        System.out.println("Зарплата сборщика: " + picker1.getSalary() + "\nЗарплата курьер: " + courier1.getSalary());
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        picker2.doWork();
        courier2.doWork();
        System.out.println("Собрано заказов, после создания 2 склада " + warehouse1.getCountPickedOrders() + "\nДоставлено заказов,после создания 2 склада: " + warehouse1.getCountDeliveredOrders());
        System.out.println("Зарплата сборщика, после создания 2 склада:  " + picker1.getSalary() + "\nЗарплата курьер, после создания 2 склада:  " + courier1.getSalary());
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10_000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
