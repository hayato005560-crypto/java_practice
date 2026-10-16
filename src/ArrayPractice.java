public class ArrayPractice {
    public static void main(String[] args) {
        printNumbers();
        doubleNumbers();
        printEvenIndexValues();
        printSelectedNumbers();
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
}