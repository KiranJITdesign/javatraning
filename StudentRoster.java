import java.util.ArrayList;
public class StudentRoster {
    public static void main(String[] args){
        ArrayList<String> roster = new ArrayList<>();
        roster.add("Alice");
        roster.add("bob");
        roster.add("charlie");
        System.out.println("initial" + roster);
        roster.add(1,"diana");
        System.out.println("After interst" + roster);
        roster.remove("bob");
        System.out.println("After reomve" + roster);
        System.out.println("content Diana" + roster.contains("Diana"));
        System.out.println("index of charlie" + roster.indexOf("charlie"));
        System.out.println("size"+ roster.size());
        System.out.println("final roster");
        for(String student : roster){
            System.out.println("     -      " + student);
        }

    }
    
}
