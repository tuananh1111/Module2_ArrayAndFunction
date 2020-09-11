import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {4, 6, 8, 11, 15, 16, 19, 22, 2, 86};
        System.out.print("Array = ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int min = minValue(array);
        System.out.println();
        System.out.println("Min value of array is: " + min);
    }

    static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
