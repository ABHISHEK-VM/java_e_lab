package Method_Overriding;

public class Main {
    public static void main(String[] args) {

        Figure figure = new Figure(20, 4);
        Rectangle rectangle = new Rectangle(4, 0, 12);
        Triangle triangle = new Triangle(4, 0, 5, 4);

        System.out.println("Area of figure : " + figure.calculateArea());
        System.out.println("Area of Rectangle : " + rectangle.calculateArea());
        System.out.println("Area of triangle : " + triangle.calculateArea());

    }

}
