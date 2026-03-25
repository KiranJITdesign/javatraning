import java.util.Scanner;

public class Report {
    double calculateAverage(int marks) {
        return marks;
        
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the marks");
       int marks = sc.nextInt();    
         Report report = new Report();  
         double subjects=5;
         System.out.println("enter the 5 subject marks");
         for(int i=0;i<5;i++)
        {
            int subjectMarks = sc.nextInt();
            double average = report.calculateAverage(subjectMarks);
            System.out.println("average marks is "+average);
        }
        switch (marks) {
            case 90:
                System.out.println(" A");
                break;
            case 80:
                System.out.println(" B");
                break;
            case 70:
                System.out.println(" C");
                break;
            default:
                System.out.println(" F");
                
        }
    }
    
}
