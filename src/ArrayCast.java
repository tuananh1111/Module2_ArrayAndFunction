import java.util.Scanner;

public class ArrayCast {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int[] array1= {1,5,6,7,8};
        System.out.print("array1=  ");
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"\t");
        }
        int[] array2= {10,12,6,8,2,6,5};
        System.out.println();
        System.out.print("array2=  ");
        for (int i=0;i<array2.length;i++){
            System.out.print(array2[i]+"\t");
        }
        int[] array3= new int[array1.length+array2.length];
        for (int i=0;i<array1.length;i++){
            array3[i]=array1[i];
        }
        for (int j=0, size=array1.length;j<array2.length;j++,size++){
            array3[size]=array2[j];
        }
        System.out.println();
        for(int x: array3){
            System.out.print(x+"\t");
        }
    }
}

