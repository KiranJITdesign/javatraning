//parameterized constructor
//default constorctor

import java.lang.reflect.Type;

public class Typesofconstroctor {
        String name;
    int age;
    public Typesofconstroctor(String name, int age) {
        this.name=name;
        this.age=age;
    }
    
//default constorctor
public Typesofconstroctor(){
    name="unknown";
    age=0;

}
  void dispay() {
      System.out.println("Name: of the person" + name); 
      System.out.println("Age: " + age);
  }
  public static void main(String[] args) {
     Typesofconstroctor ob  = new Typesofconstroctor("david",10);
     Typesofconstroctor ob1 = new Typesofconstroctor();
      ob.dispay();
      ob1.dispay();
  }
    
}
    

