package Method_Overriding;

public class Triangle extends Figure {

    double base;
    double height;

    Triangle(double length, int numberOfSides, double base, double height) {
        super(length, numberOfSides);
        this.base = base;
        this.height = height;

    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

}
