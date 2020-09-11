import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Enter the size");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.print("Print the list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        int max = array[0];
        int index = 1;
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index++;
            }
        }
        System.out.println("Max value in the array: " + max + " at the position " + index);


    }
}
