import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] array= {6,7,8,9,10,12,16,18,20};
        System.out.println("Enter the number do you want delete:");
        int number= input.nextInt();
        int a=checkIndex(array,number);
        System.out.println("Index of number is: "+ a);
        delete(array, a);


    }
    static int checkIndex(int[] array, int number){
        for (int i=0; i<array.length; i++){
            if(number==array[i]){
                return i;
            }
        }
        return -1;
    }
    static void delete(int[] array,int index){
        for (int i=index;(i<array.length)&&(index>=0);i++){
            if(i== array.length-1){
                array[i]=0;
            }
            else array[i]=array[i+1];

            if(i==array.length-2||i==array.length-1) {
                if(i!=array.length-1) {
                    array[i + 1] = 0;
                }
                System.out.print("New Array ="+"\t");
                for(int j=0; j<array.length;j++){
                    System.out.print(" "+array[j]);
                }
                return;
            }
        }
        System.out.println("Element is not found ");
    }
}
