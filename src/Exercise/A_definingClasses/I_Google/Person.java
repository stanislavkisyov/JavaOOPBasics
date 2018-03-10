package Exercise.A_definingClasses.I_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Car car;
    private Company company;
    private List<Parents> parents;
    private List<Children> children;
    private List<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
        this.car = new Car();
        this.company = new Company();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void addParent(Parents parents) {
        this.parents.add(parents);
    }

    public void addChild(Children children) {
        this.children.add(children);
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(this.name).append(System.lineSeparator());
        sb.append(this.company.toString()).append(System.lineSeparator());
        sb.append(this.car.toString()).append(System.lineSeparator());
        sb.append("Pokemon:");
        if (!this.pokemons.isEmpty()) {
            for (Pokemon pokemon : pokemons) {
                sb.append(pokemon.toString());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("Parents:");
        if (!this.parents.isEmpty()) {
            for (Parents parent : parents) {
                sb.append(parent.toString());
            }
        }
        sb.append(System.lineSeparator());
        sb.append("Children:").append(System.lineSeparator());
        if (!this.children.isEmpty()) {
            for (Children child : children) {
                sb.append(child.toString());
            }
        }
        return sb.toString();
    }
}
