package Exercise.A_definingClasses.E_SpeedRacing;


public class Car {
    private static final int DEFAULT_DISTANCE_TRAVELED = 0;

    private String model;
    private double fuelAmount;
    private double fuelCostForKilometers;
    private int distanceTraveled;


    public Car(String model, double fuelAmount, double fuelCostForKilometers) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostForKilometers = fuelCostForKilometers;
        this.distanceTraveled = DEFAULT_DISTANCE_TRAVELED;
    }

    public String getModel() {
        return this.model;
    }

    public double getFuelAmount() {
        return this.fuelAmount;
    }

    public double getFuelCostForKilometers() {
        return this.fuelCostForKilometers;
    }

    public void drive(double distance) {
        double fuelNeeded = distance * this.fuelCostForKilometers;
        if (fuelNeeded > fuelAmount) {
            throw new IllegalStateException("Insufficient fuel for the drive");
        }
        this.distanceTraveled += distance;
        this.fuelAmount -= fuelNeeded;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);
    }
}
