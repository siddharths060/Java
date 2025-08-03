public class Main {
    public static void main(String[] args) {
        // trying to initiate an abstract class gives an error
       //  Shape shape = new Shape();
        Circle c = new Circle();
        c.setRadius(15);

        c.draw();
        System.out.println("Area of circle: " + c.area());
    }
}
