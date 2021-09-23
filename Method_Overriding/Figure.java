package Method_Overriding;

public class Figure {

    double length;
    int numberOfSides;

    Figure(double length, int numberOfSides) {

        this.length = length;
        this.numberOfSides = numberOfSides;

    }

    double calculateArea() {
        double area = length * numberOfSides;
        System.out.println("Area in figure class : " + area);
        return area;

    }

}
