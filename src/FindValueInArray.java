import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name you want find: ");
        String name = input.nextLine();
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Hazard", "Mark", "Cris"};
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the student in the list " + name + " is:" + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found " + name + " in the list");
        }
    }
}
