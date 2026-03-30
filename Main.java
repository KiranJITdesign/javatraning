class Puppy {
    public void type() {
        System.out.println("puppy is a dog");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.type();
        d.bark();
        Puppy p = new Puppy();
        p.type();
    }
}
