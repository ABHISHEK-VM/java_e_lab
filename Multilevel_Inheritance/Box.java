package Multilevel_Inheritance;

public class Box {

    double width;
    double height;
    double depth;

    Box(Box box) {

        width = box.width;
        height = box.height;
        depth = box.depth;

    }

    Box(double width, double height, double depth) {

        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box(double len) {
        this.width = this.height = this.depth = len;
    }

    double calculateVolume() {
        double volume = width * height * depth;
        return volume;
    }

}
