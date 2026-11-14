
public class JavaReview {

    public static void main(String[] args) {

        System.out.println("===== 問1：データ型とキャスト =====");
        review01();

        System.out.println("\n===== 問2：条件分岐 =====");
        review02();

        System.out.println("\n===== 問3：変数のスコープ =====");
        review03();

        System.out.println("\n===== 問4：引数と戻り値 =====");
        review04();

        System.out.println("\n===== 問5：メソッドの分割 =====");
        review05();

        System.out.println("\n===== 問6：配列の集計 =====");
        review06();

        System.out.println("\n===== 問7：最小値と平均値 =====");
        review07();
    }

    /*
     * 問1：データ型とキャスト
     *
     * 技術用語：
     * ・キャスト（Cast）：明示的な型変換
     * ・整数除算：int同士の割り算では小数部分が切り捨てられる
     *
     * 学習ポイント：
     * double型の変数に代入しても、
     * int同士で計算した結果の小数部分は戻らない。
     */
    public static void review01() {
        int sum = 17;
        int count = 4;

        double a = sum / count;
        double b = (double) sum / count;

        System.out.println("キャストなし: " + a);
        System.out.println("キャストあり: " + b);
    }

    /*
     * 問2：条件分岐
     *
     * 技術用語：
     * ・条件分岐（Conditional Branching）
     * ・論理AND演算子（&&）
     *
     * 学習ポイント：
     * &&は両方の条件がtrueのときに成立する。
     * 今回は非会員なので割引されない。
     */
    public static void review02() {
        int total = 12000;
        boolean isMember = false;
        double discountRate = 0.0;

        if (isMember && total >= 10000) {
            discountRate = 0.2;
        } else if (isMember && total >= 5000) {
            discountRate = 0.1;
        }

        double finalPrice = total * (1 - discountRate);

        System.out.println("割引後金額: " + finalPrice);
    }

    /*
     * 問3：変数のスコープ
     *
     * 技術用語：
     * ・スコープ（Scope）：変数を参照できる範囲
     * ・ローカル変数（Local Variable）
     *
     * 学習ポイント：
     * ifブロック内で宣言した変数は、
     * そのブロックの外では使用できない。
     */
    public static void review03() {
        int number = 10;
        int result = 0;

        if (number > 5) {
            result = number * 2;
        }

        System.out.println("計算結果: " + result);
    }

    /*
     * 問4：引数と戻り値
     *
     * 技術用語：
     * ・実引数（Argument）：呼び出すときに渡す値
     * ・仮引数（Parameter）：メソッドが受け取る変数
     * ・戻り値（Return Value）：呼び出し元へ返す値
     *
     * 学習ポイント：
     * returnは変数そのものではなく、
     * 変数に格納されている値を返す。
     */
    public static void review04() {
        int result = multiply(4, 6);

        System.out.println("掛け算結果: " + result);
    }

    public static int multiply(int a, int b) {
        int answer = a * b;

        return answer;
    }

    /*
     * 問5：メソッドの分割
     *
     * 技術用語：
     * ・メソッド宣言（Method Declaration）
     * ・メソッド呼び出し（Method Invocation）
     * ・責務分離（Separation of Responsibilities）
     *
     * 学習ポイント：
     * calculateAverageは平均値を計算する。
     * calculateSumは合計値を計算する。
     * 別のメソッドを呼び出して処理を再利用できる。
     */
    public static void review05() {
        int[] scores = {75, 90, 82, 68, 88};

        double average = calculateAverage(scores);

        System.out.println("平均点: " + average);
    }

    public static double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers);

        double averageScore = (double) sum / numbers.length;

        return averageScore;
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    /*
     * 問6：配列の集計
     *
     * 技術用語：
     * ・配列の走査（Traversal）
     * ・カウンタ変数
     * ・累積変数
     *
     * 学習ポイント：
     * 1つのfor文で合計と条件に一致する人数を集計する。
     */
    public static void review06() {
        int[] scores = {65, 82, 90, 73, 100};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] >= 80) {
                count++;
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("合計点: " + sum);
        System.out.println("80点以上の人数: " + count + "人");
        System.out.println("平均点: " + average);
    }

    /*
     * 問7：最小値と平均値
     *
     * 技術用語：
     * ・最小値探索
     * ・メソッド分割
     *
     * 学習ポイント：
     * 最小値を配列の最初の要素で初期化する。
     * 引数で配列を受け取り、計算結果をreturnで返す。
     */
    public static void review07() {
        int[] numbers = {12, 8, 20, 4, 16};

        int min = findMin(numbers);
        double average = calculateAverage(numbers);

        System.out.println("最小値: " + min);
        System.out.println("平均値: " + average);
    }

    public static int findMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }
}
