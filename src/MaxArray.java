import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Row in array");
        int n = input.nextInt();
        System.out.println("Column in array");
        int m = input.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " );
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
        int max= arr[0][0];
        for (int i=0; i<n;i++){
            for (int j=1;j<m;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
