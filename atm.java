import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter current balance");
        double balance = sc.nextDouble();
        System.out.println("enter the amount to withdraw");
        double withdraw = sc.nextDouble();
        System.out.println("enter account type(1=saving,2=current)");
        int type = sc.nextInt();

        if (withdraw % 100 != 0) {
            System.out.println("not a multiple of 100");
        } else if (withdraw > 50000) {
            System.out.println("exceeds the limit");
        } else if (type == 1) {
            if (withdraw > balance) {
                System.out.println("insufficient balance");
            } else {
                balance -= withdraw;
                System.out.println("withdraw successful. remaining balance: " + balance);
            }
        } else if (type == 2) {
            if (withdraw > balance + 10000) {
                System.out.println("exceeds overdraft limit");
            } else {
                balance -= withdraw;
                System.out.println("withdraw successful. remaining balance: " + balance);
            }
        } else {
            System.out.println("invalid account type");
        }
    }
}
