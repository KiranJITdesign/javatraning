abstract class Abstract {
    String colour;
    Abstract(String colour){
        this.colour = colour;
    }
    abstract double area();
    abstract double perimeter();    
    void display(){
        System.out.println("Colour: " + colour);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());

    }
    static class circle extends Abstract{
        double radius;
        circle(String colour, double radius){
            super(colour);
            this.radius = radius;
        }
        double area(){
            return Math.PI * radius * radius;
        }
        double perimeter(){
            return 2 * Math.PI * radius;
        }
    }
    static class Main{
        public static void main(String[] args) {
            circle c = new circle("Red", 5);
            c.display();
        }
    }
}


