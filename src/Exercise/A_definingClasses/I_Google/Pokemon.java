package Exercise.A_definingClasses.I_Google;

public class Pokemon {
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.pokemonName == null && pokemonType == null) {
            return sb.toString();
        }
        sb.append(System.lineSeparator()).append(String.format("%s %s", this.pokemonName, this.pokemonType));
        return sb.toString();
    }
}
