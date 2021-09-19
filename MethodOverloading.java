public class MethodOverloading {

    public static void main(String[] args) {
        int length = 12;
        int breadth = 8;
        int side = 16;
        double radius = 12;

        Area area = new Area();

        int areaOfSquare = area.area(side);
        System.out.println("Area of Square is " + areaOfSquare);

        double areaOfCircle = area.area(radius);
        System.out.println("Area of Circle is " + areaOfCircle);

        int areaOfRectangle = area.area(length, breadth);
        System.out.println("Area of Rectangle is " + areaOfRectangle);

    }

}

class Area {

    public double area(double radius) {
        double result = 3.14 * radius * radius;
        return result;
    }

    public int area(int side) {
        int result = side * side;
        return result;
    }

    public int area(int length, int breadth) {
        int result = length * breadth;
        return result;
    }
}