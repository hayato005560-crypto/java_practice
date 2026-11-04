public class Lesson9 {
    public static void main(String[] args) {
        int[] scores = {75, 90, 82, 68, 88};

        int max = findMax(scores);

        System.out.println("最高点: " + max);
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        
        // 初期値に[0]を設定しているので、ループは[1]から始める。
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        
        return max;
    }
    
}