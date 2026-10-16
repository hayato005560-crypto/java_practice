public class ArrayPractice {
    public static void main(String[] args) {
        printNumbers();
        doubleNumbers();
        printEvenIndexValues();
        printSelectedNumbers();
        initializeNumbers();
    }

    public static void printNumbers() {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void doubleNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
            System.out.println(numbers[i]);
        }
    }

    // iはインデックス（位置）、numbers[i]はその位置に格納された値、間違えやすいので注意
    public static void printEvenIndexValues() {
        int[] numbers = {15, 22, 37, 44, 59, 66};

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }

    public static void printSelectedNumbers() {
        int[] numbers = {11, 12, 13, 14, 15, 16};

        for (int i = 0; i < numbers.length; i++) {
            if (i < 3) {
                if (numbers[i] % 2 != 0) {
                    System.out.println(numbers[i]);
                }
            } else {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }

    // 配列初期化、参照元をインデックスで指定するのか、値で指定するのか、間違えやすいので注意
    public static void initializeNumbers() {
        int[] numbers = new int[20];
        boolean first = true;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 5;

            if (i <= 10) {
                if (numbers[i] % 2 != 0) {
                    if (!first) {
                        System.out.print(",");
                    }
                    
                    System.out.print(numbers[i]);
                    first = false;
                }  
            } else {
                if (numbers[i] % 2 == 0) {
                    if (!first) {
                        System.out.print(",");
                    }
                    
                    System.out.print(numbers[i]);
                    first = false;
                }
            }
        }
    }
}