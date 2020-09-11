import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 20;
        int[] array;
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter the element " + (i + 1) + ":");
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < size / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println();
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
