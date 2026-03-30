import java.util.Scanner;   
public class Methods {
public static void calculateArea(double radius) {
    double area=Math.pow(radius, 2) * Math.PI;
    System.out.println("Area of the circle is "+area);
}
public static void main(String[] args) {
    int radius;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
        radius=sc.nextInt();
      calculateArea(radius);
      sc.close();
    }
}
