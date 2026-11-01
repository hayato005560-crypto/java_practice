public class Test4 {
    public static void main(String[] args) {
        int[] numbers = new int[20]; //newで新規作成 データ型を指定していくつ格納するかを指定
        boolean first = true;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 5;
        }

        System.out.print("奇数：");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                if (!first) {
                    System.out.print(", ");
                }

                System.out.print(numbers[i]);
                first = false;
            }
        }

        System.out.println();

        first = true;  // 変数を初期状態に戻す

        System.out.print("偶数：");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                if (!first) {
                    System.out.print(", ");
                }

                System.out.print(numbers[i]);
                first = false;
            }
        }

        System.out.println();
    }
}