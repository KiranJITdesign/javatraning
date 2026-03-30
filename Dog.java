//single level inheritance  one parrent and one child class
//multilevel inheritance  one parrent and one child class and one grand child class
public class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
    public static void main(String[] args) {
        Dog ob = new Dog();
        ob.type();
        ob.bark();
    }

    
}
