public class RjcExamPractice4 {
    public static void main(String[] args) {
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