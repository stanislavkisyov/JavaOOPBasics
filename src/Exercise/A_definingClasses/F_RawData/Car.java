package Exercise.A_definingClasses.F_RawData;

import java.util.List;
import java.util.Set;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public List<Tire> getTires() {
        return this.tires;
    }

    @Override
    public String toString() {
        return this.model;
    }

    public Engine getEngine() {
        return this.engine;
    }
}
