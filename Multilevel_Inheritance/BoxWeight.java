package Multilevel_Inheritance;

public class BoxWeight extends Box {

    double weight;

    BoxWeight(double width, double height, double depth, double weight) {

        super(height, width, depth);
        this.weight = weight;
    }

    double calculateDensity() {
        double mass = weight / 9.8;
        double density = mass / calculateVolume();
        return density;
    }

}
