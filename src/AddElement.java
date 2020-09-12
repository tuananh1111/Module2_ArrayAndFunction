import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 5, 6, 7, 9, 0, 0, 0, 0, 0};
        System.out.print("array= ");
        for (int x : array) {
            System.out.print(x + "\t");
        }
        System.out.println();
        System.out.println("Enter the number:");
        int number = input.nextInt();
        System.out.println("Enter the index:");
        int index = input.nextInt();
        findAndAddNumber(number, index, array);

    }

    static void findAndAddNumber(int number, int index, int[] array) {
        for (int j=array.length-1;j>=index;j--){
            if(j==index){
                array[j]=number;
                break;
            }
            array[j]=array[j-1];
        }
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+ "\t");
        }
    }
}
