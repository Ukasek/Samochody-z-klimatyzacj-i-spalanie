public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, double tankCapacity, double avgConsumption, boolean airConditioning, double loadWeight) {
        super(name, tankCapacity, avgConsumption, airConditioning);
        this.loadWeight = loadWeight;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double currentConsumption() {
        double currentConsumption;
        if (!isAirConditioning()) {
            currentConsumption = getAvgConsumption() + loadConsumption();
        } else {
            currentConsumption = getAvgConsumption() + loadConsumption() + 1.6;
        }
        return currentConsumption;
    }

    public double loadConsumption() {
        double loadConsumption = Math.round(loadWeight / 100) * 0.5;
        return loadConsumption;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Dodakowy ciężar ładunku: " + loadWeight + " kg");
    }
}

