public class Test4 {
    public static void main(String[] args) {
        int[] numbers = {15, 9, 12, 10, 6};
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        boolean first = true;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max ) {
                max = numbers[i];
            }
            
            if (numbers[i] < min ) {
                min = numbers[i];
            }
            
            sum += numbers[i];
        }
        
        double average = (double) sum / numbers.length;
        
        
        
        System.out.println("最大値 : " + max);
        System.out.println("最小値 : " + min);
        System.out.print("平均以下の数字 : " );
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= average) {
                if (!first) {
                    System.out.print(", ");
                }
                
                System.out.print(numbers[i]);
                first = false;
            }
        }
    }
}