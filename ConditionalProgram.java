import java.util.Scanner;

public class ConditionalProgram {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your age");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("you are eligible to vote");
        } else{
            System.out.println("you are not eligible to vote");
        }
    }
}
