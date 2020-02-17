public class Car extends Vehicle {
    private boolean airConditioning;

    public Car(String name, double tankCapacity, double avgConsumption, boolean airConditioning) {
        super(name, tankCapacity, avgConsumption);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public double currentConsumption() {
        double currentConsumption;
        if (!airConditioning) {
            currentConsumption = getAvgConsumption();
        } else {
            currentConsumption = getAvgConsumption() + 0.8;
        }
        return currentConsumption;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Klimatyzacja jest włączona: " + airConditioning);
    }
}
