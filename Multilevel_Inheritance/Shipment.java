package Multilevel_Inheritance;

public class Shipment extends BoxWeight {

    double cost;

    Shipment(double width, double height, double depth, double weight, double cost) {

        super(height, width, depth, weight);
        this.width = width;

    }

    double cost() {

        return calculateDensity() * 1.5;
    }

}
