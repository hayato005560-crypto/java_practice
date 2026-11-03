public class Lesson2 {
    public static void main(String[] args) {
        int total = 7500;
        boolean isMember = true;
        double discountRate = 0.0;
        
        if (isMember && total >= 10000) {
            discountRate = 0.2;
        } else if (isMember && total >= 5000) {
            discountRate = 0.1;
        }
        
        double discountedTotal = total * (1 - discountRate);
        
        System.out.println("購入金額: " + total + "円");
        System.out.printf("割引率: %.0f%%%n", discountRate * 100);
        System.out.printf("割引後金額: %.1f円%n", discountedTotal);
    }
}