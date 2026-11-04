public class Lesson8 {
    public static void main(String[] args) {
        int[] scores = {75, 90, 82, 68, 88};

        double average = calculateAverage(scores);

        System.out.println("平均点: " + average);
    }

    // 平均を求める処理
    public static double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers);
        
        double averageScore = (double) sum / numbers.length;
        
        return averageScore;
    }
    
    // 合計を求める処理
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        return sum;
    }
}