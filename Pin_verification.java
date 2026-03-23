import java.util.Scanner;

public class Pin_verification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin=1234;

        int attempts=0;
        while(attempts<3){
            System.out.println("Enter your PIN: ");
            int enteredPin=sc.nextInt();
            if(enteredPin==pin){
                System.out.println("PIN verified successfully");
                break;
            }
            else{
                System.out.println("Incorrect PIN");
                System.out.println("access denied");
                System.out.println("account Locked");
                attempts++;
            }
        }
        sc.close();
    }   

}