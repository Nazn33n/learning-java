package basics;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("pink",4 );
        Bike bike = new Bike("Black", 2);
        System.out.println(vehicle.getColor());
        System.out.println(vehicle.getWheel());
        System.out.println(bike.getWheel());
    }
}
