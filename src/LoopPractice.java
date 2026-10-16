public class LoopPractice {

    public static void main(String[] args) {
        printEvenNumbers();
        countEvenNumbers();
    }

    // 課題1：1〜10の偶数を表示する
    public static void printEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { //iが偶数かどうかを判定する条件式
                System.out.println(i);
            }
        }
    }

    // 課題2：1〜10の偶数の個数を数える
    public static void countEvenNumbers() {
        int count = 0; // 変数を外に置くことでfor文の後でも変化した値を使用できるようにする

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}