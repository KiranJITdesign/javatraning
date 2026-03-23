import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter membership status (1=member, 0=not): ");
        int member = sc.nextInt();

        double discountRate;

        if (amount <= 500) {
            discountRate = 0;
        } else if (amount <= 1000) {
            discountRate = 0.10;
        } else if (amount <= 2000) {
            discountRate = 0.20;
        } else {
            discountRate = 0.30;
        }

        
        if (member == 1) {
            discountRate += 0.05; 
        }

        double discount = amount * discountRate;
        double finalAmount = amount - discount;

        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Discount Amount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);

        sc.close();
    }
}
