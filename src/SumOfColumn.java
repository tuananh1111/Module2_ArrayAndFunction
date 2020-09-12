import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Row in array");
        int a = input.nextInt();
        System.out.println("Column in array");
        int b = input.nextInt();
        int[][] arr = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " );
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%-4d",arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter the column:");
        int column= input.nextInt();
        System.out.println();
        int sum=0;
        for (int i=0; i<arr.length;i++){
            sum+=arr[i][column];
        }
        System.out.println(sum);

    }
}
