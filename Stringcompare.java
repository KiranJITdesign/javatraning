public class Stringcompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
//they have new keyword so that they are different objects in memory
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        
        if (str1 == str2) {
            System.out.println("The string references are the same.");
        } else {
            System.out.println("The string references are different.");
        }
    }
    
}
