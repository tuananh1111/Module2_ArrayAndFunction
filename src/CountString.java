import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str;
        do {
            System.out.println("Enter the char:");
             str= input.nextLine();
            if (str.length()>=2){
                System.out.println("Sorry, max string =1");
            }
        }while(str.length()>=2);

        String string= "Don’t cry because it’s over, smile because it happened.";
        System.out.println(string);
        int count=0;
        for (int i =0;i<string.length();i++){
            if (str.charAt(0) == string.charAt(i)){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
