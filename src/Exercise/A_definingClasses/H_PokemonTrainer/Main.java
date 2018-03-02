package Exercise.A_definingClasses.H_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Trainer> map = new LinkedHashMap<>();

        String line;

        getTrainersAndPokemons(reader, map);


        while (true) {
            String command = reader.readLine();
            if ("End".equals(command)) {
                break;
            }
            for (String s : map.keySet()) {
                if (map.get(s).chekForElement(command)) {
                    map.get(s).adStars();
                } else {
                    map.get(s).increaseHealth();
                }
            }
        }
        map.entrySet().stream().sorted((t1,t2)-> {
            return Integer.compare(t2.getValue().getNumOfStars(), t1.getValue().getNumOfStars());
        }).forEach(trainer -> System.out.println(trainer.getValue()));
    }

    private static void getTrainersAndPokemons(BufferedReader reader, Map<String, Trainer> map) throws IOException {
        String line;
        while (!"Tournament".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int health = Integer.valueOf(tokens[3]);

            map.putIfAbsent(trainerName, new Trainer(trainerName));
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, health);
            map.get(trainerName).getPokemons().add(pokemon);

        }
    }
}
