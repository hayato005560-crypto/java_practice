public class Lesson4 {
    public static void main(String[] args) {
        int[] scores = {75, 90, 82, 68, 88};
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        
        double average = (double) sum / scores.length;
        
        for (int i = 0; i < scores.length; i++) {
            if (average <= scores[i]) {
                count++;
            }
        }
        
        System.out.println("平均点以上の人数: " + count + "人");
    }
}