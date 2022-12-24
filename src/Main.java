import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість рядків:  ");
        int n = scanner.nextInt();
        System.out.println("Введіть кількість стовбців: ");
        int m = scanner.nextInt();
        int[][] result = new int[m][n];
        int[][] array = new int [n][m];

        System.out.println("Оригінальна матриця ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = array[j][i];
            }
        }
        System.out.println("Транспонована матриця ");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }
    }
}

