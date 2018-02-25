package Exercise.A_definingClasses.G_CarSalesman;

public class Engine {
    public static final int DEFAULT_DISPLACEMENT = -1;
    public static final String DEFAULT_EFFICIENCY= "n/a";

    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = DEFAULT_DISPLACEMENT;
        this.efficiency = DEFAULT_EFFICIENCY;
    }

    public Engine(String model, int power, int displacement) {
       this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }
    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("  ")
                .append(this.model)
                .append(":")
                .append(System.lineSeparator())
                .append("    Power: ")
                .append(this.power)
                .append(System.lineSeparator());
        if (this.displacement == -1) {
            sb.append("    Displacement: n/a").append(System.lineSeparator());
        } else {
            sb.append("    Displacement: ").append(this.displacement).append(System.lineSeparator());
        }

        sb.append("    Efficiency: ").append(this.efficiency).append(System.lineSeparator());
        return sb.toString();
    }
}
