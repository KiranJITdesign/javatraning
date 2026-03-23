import java.util.Scanner;

public class tshirt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("select tshirt size(s,m,l,xl)");
        String size = scanner.nextLine();

        switch (size.toUpperCase()) {
            case "S":
                System.out.println("small size selected");
                break;
            case "M":
                System.out.println("medium size selected");
                break;
            case "L":
                System.out.println("large size selected");
                break;
            case "XL":
                System.out.println("extra large size selected");
                break;
            default:
                System.out.println("invalid size selected");
        }

        scanner.close();
    }
}
