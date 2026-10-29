
class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order placed successfully.");
    }
}

class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order is out for delivery.");
        System.out.println("Order delivered successfully.");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        OrderPlacement t1 = new OrderPlacement();
        OrderDelivery t2 = new OrderDelivery();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        t2.start();
    }
}
