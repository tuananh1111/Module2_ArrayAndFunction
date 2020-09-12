import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size= input.nextInt();
        int[] array= new int[size];
        for (int i=0; i<array.length;i++){
            System.out.print("Element "+i +" :");
            array[i]=input.nextInt();
        }
        int min=array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println();
        System.out.println("Min of array is : "+min);
    }
}
