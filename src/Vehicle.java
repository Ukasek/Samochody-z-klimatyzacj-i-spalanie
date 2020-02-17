public class Vehicle {
    private String name;
    private double tankCapacity;
    private double avgConsumption;

    public Vehicle(String name, double tankCapacity, double avgConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avgConsumption = avgConsumption;
    }

    public double currentConsumption() {
        double currentConsumption = getAvgConsumption();
        return currentConsumption;
    }

    public double vehicleRange() {
        double range = Math.round(getTankCapacity() / currentConsumption() * 100);
        return range;
    }

    public void showInfo() {
        System.out.println("Nazwa pojazdu: " + getName() + " Pojemność baku: " + getTankCapacity() + "l"
                + " Srednie spalanie: " + currentConsumption() + "l" + " Zasięg pojazdu: " + vehicleRange() + " km");
    }

    public String getName() {
        return name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getAvgConsumption() {
        return avgConsumption;
    }

}
