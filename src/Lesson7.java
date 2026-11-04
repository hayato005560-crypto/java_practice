public class Lesson7 {
    public static void main(String[] args) {
        int[] scores = {75, 90, 82, 68, 88};

        double average = calculateAverage(scores);

        System.out.println("平均点: " + average);
    }

    // 引数としてのデータの型の指定と処理自体が返す値の型の指定が必要。
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        double averageScore = (double) sum / numbers.length;
        
        return averageScore;
    }
}