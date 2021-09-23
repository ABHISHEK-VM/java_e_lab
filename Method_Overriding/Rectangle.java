package Method_Overriding;

public class Rectangle extends Figure {

    double breadth;

    Rectangle(double length, int noOfSides, double breadth) {

        super(length, noOfSides);
        this.breadth = breadth;

    }

    @Override
    double calculateArea() {
        super.calculateArea();
        return length * breadth;

    }

}
