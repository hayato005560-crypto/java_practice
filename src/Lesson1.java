public class Lesson1 {
    public static void main(String[] args) {
        int price = 1200;
        int quantity = 3;
        double taxRate = 0.10;
        int subtotal = price * quantity;
        double total = subtotal * (1 + taxRate);
        
        System.out.println("税抜価格: " + subtotal + "円");
        System.out.printf("税込価格: %.1f円%n", total);
    }
}