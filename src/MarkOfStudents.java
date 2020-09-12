import java.util.Scanner;

public class MarkOfStudents {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int mark;
        int size;
        int[] array;
        do {
            System.out.println("Enter the size:");
            size= input.nextInt();
            if(size>30){
                System.out.println("Size so much, max =30 ");
            }
        }while (size>30);
        array= new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("Enter mark of students "+(i+1)+" :");
            array[i]= input.nextInt();
        }
        int count=0;
        for (int i=0; i<array.length;i++) {
            System.out.println(array[i]);
            if (array[i]>=5 && array[i]<=10){
                count++;
            }
        }
        System.out.println("The number of students pass the exam is: "+count);
    }
}
