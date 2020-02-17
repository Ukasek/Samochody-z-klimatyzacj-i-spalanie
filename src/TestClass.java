public class TestClass {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("VW Passat", 55, 8.5, false);
        vehicles[1] = new Truck("Volvo FH", 300, 29, false, 4500);
        vehicles[2] = new Car("Opel Corsa", 40, 6, false);
        vehicles[3] = new Truck("Scania S 730", 250, 25, false, 4000);


        vehicles[0].showInfo();
        ((Car) vehicles[0]).setAirConditioning(true);
        vehicles[0].showInfo();
        vehicles[1].showInfo();
        ((Truck) vehicles[1]).setAirConditioning(true);
        vehicles[1].showInfo();
    }
}
