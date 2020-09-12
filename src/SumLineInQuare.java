import java.util.Scanner;

public class SumLineInQuare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row and column in the square array: ");
        int number = input.nextInt();
        int[][] array = new int[number][number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("array[" + i + "][" + j + "]=");
                array[i][j] = input.nextInt();
                System.out.println();
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int a = sumLine(array);
        System.out.println("Sum of Square Array = " + a);

    }

    static int sumLine(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][i];
                }
            }

        }
        return sum;
    }
}
