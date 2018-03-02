package Exercise.A_definingClasses.H_PokemonTrainer;

import java.util.LinkedList;
import java.util.List;

public class Trainer {
    private static final int DEFAULT_STARS = 0;
    private String name;
    private int numOfStars;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numOfStars = DEFAULT_STARS;
        this.pokemons = new LinkedList<>();
    }

    public static int getDefaultStars() {
        return DEFAULT_STARS;
    }

    public String getName() {
        return this.name;
    }

    public int getNumOfStars() {
        return this.numOfStars;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }


    public boolean chekForElement(String command) {
        for (int i = 0; i < this.pokemons.size(); i++) {
            if (pokemons.get(i).getElement().equals(command)) {
                return true;
            }
        }
        return false;
    }

    public void adStars() {
        this.numOfStars++;
    }

    public void increaseHealth() {
        List<Integer> pokemonForRemove = new LinkedList<>();
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getHealth() - 10 <= 0) {
                pokemonForRemove.add(i);
            } else {
                pokemons.get(i).increaseHealth();
            }
        }
        this.removePokemons(pokemonForRemove);
    }

    private void removePokemons(List<Integer> pokemonIndexes) {
        for (int i = pokemonIndexes.size() - 1; i >= 0; i--) {
            pokemons.remove((int)pokemonIndexes.get(i));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",this.name, this.numOfStars, this.pokemons.size());
    }
}
