public class JavaIfPractice {
    public static void main(String[] args) {
        int score = 70;
        int testScore = 72;

        if (score >= 80) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }

        // rubyと使い方は近い 上から処理するので間の条件でも前の条件に当てはまらないは余分なコードを書かずに使用できる
        if (testScore >= 80) {
            System.out.println("合格");
        } else if (testScore >= 60) {
            System.out.println("再試験");
        } else {
            System.out.println("不合格");
        }

        System.out.println("判定完了");
    }
}