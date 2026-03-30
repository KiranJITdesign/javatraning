//1 child  2 parent class
//interface is a blueprint of class
//herical inheritance
public class Herical {
    static class Puppy {
        public void type() {
            System.out.println("puppy is a dog");
        }
    }

    class dog extends Puppy {
        public void bark() {
            System.out.println("dog barks");
        }
    }

    class cat extends Puppy {
        public void meow() {
            System.out.println("cat meows");
        }
    }

    public static void main(String[] args) {
        Herical h = new Herical();
        dog d = h.new dog();
        cat c = h.new cat();

        d.type();
        d.bark();
        c.type();
        c.meow();
    }
}
