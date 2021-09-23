package Multilevel_Inheritance;

public class Main {

    public static void main(String[] args) {

        Box box = new Box(4, 5, 6);
        BoxWeight boxWeight = new BoxWeight(5, 8, 3, 5);
        Shipment shipment = new Shipment(3, 2, 1, 4, 5);

        System.out.println("Volume : " + box.calculateVolume());

        System.out.println("Density : " + boxWeight.calculateDensity());

        System.out.println("Cost : " + shipment.cost());

    }

}
