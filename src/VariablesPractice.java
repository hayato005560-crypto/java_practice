public class VariablesPractice {
    // mainはプログラムの実行開始地点
    // String[] argsは起動時に渡される文字列の配列
    // main内ではintやbooleanなど、別の型の変数も自由に宣言できる
    public static void main(String[] args) {

        // 整数型
        int age = 28;
        System.out.println(age);

        // 文字列型
        String name = "Hiro";
        System.out.println(name);

        // 整数の計算
        int number = 10;
        System.out.println(number + 5);

        // 文字列の連結
        String text = "20";
        System.out.println(text + 5);

        // 真偽値型
        boolean isAdult = age >= 18;
        System.out.println(isAdult);

        // 比較演算子
        boolean result = number == 5;
        System.out.println(result);

        // テスト比較と真偽値の出力
        int score = 85;
        boolean isPassed = score >= 80;
        System.out.println(isPassed);

        // コンパイルする
        // javac フォルダ名/ファイル名

        // 実行する
        // java -cp フォルダ名 クラス名

    }
}