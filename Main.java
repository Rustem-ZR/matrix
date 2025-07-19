import java.util.Random;

public class Main {

    public static final int SIZE = 8;

    public static void main(String[] args) {


        int[][] colors = createColors(SIZE, SIZE);


        System.out.println("Матрица 1 : ");
        printColors(colors);


        int[][] reverse = rotateColors(colors, 90
        );

        System.out.println("Матрица 2 : ");
        printColors(reverse);


    }

    private static int[][] rotateColors(int[][] colors, int options) {
        int size = colors.length;
        int[][] reverse = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (options) {
                    case 90:
                        reverse[i][j] = colors[size - 1 - j][i];
                        break;
                    case 180:
                        reverse[i][j] = colors[size - 1 - i][size - 1 - j];
                        break;
                    case 270:
                        reverse[size - 1 - j][i] = colors[i][j];
                        break;

                }

            }
        }
        return reverse;
    }

    private static int[][] createColors(int size, int size1) {
        int[][] colors = new int[size][size1];
        Random random = new Random();
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        return colors;

    }

    private static void printColors(int[][] colors) {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }
}
