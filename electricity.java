import java.util.Scanner;
public class electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of units consumed");
        int units = sc.nextInt();
        double bill;
        if (units <= 100) { 
            bill = units * 1.50; 
        } else if (units <= 200) { 
            bill = 100 * 1.500 + (units - 100) * 2.00; 
        } else if (units <= 300) { 
            bill = 100 * 1.50 + 100 * 2.00 + (units - 200) * 2.50; 
        } else { 
            bill = 100 * 1.50 + 100 * 2.00 + 100 * 2.50 + (units - 300) * 4.00; 
        }
        System.out.println("enter the total bill amount" + bill);
    }
}
