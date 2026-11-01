public class ForFrontier {
    public static void main(String[] args) {

        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= 9; j++) {

                if (i * j != 27) {
                    System.out.printf("%d×%d=%2d%n", i, j, i * j);
                }

            }
        }
    }
}