package Exercise.A_definingClasses.I_Google;

public class Car {
    private String model;
    private int speed;

    public Car() {
    }

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Car:");
        if (this.model == null && this.speed == 0) {
            return sb.toString();
        }

        sb.append(System.lineSeparator()).append(String.format("%s %d", this.model, this.speed));
        return sb.toString();
    }
}
