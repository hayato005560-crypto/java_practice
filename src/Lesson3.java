public class Lesson3 {
    public static void main(String[] args) {
        int[] scores = {75, 90, 82, 68, 88};
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 80) {
                count++;
            }
            sum += scores[i];
        }
        
        double average = (double) sum / scores.length;
        // double型にキャストすることで、整数同士の割り算ではなく、小数点以下も含めた割り算を行うことができる。
        
        System.out.println("80点以上の人数: " + count + "人");
        System.out.println("平均点: " + average + "点");
    }
}