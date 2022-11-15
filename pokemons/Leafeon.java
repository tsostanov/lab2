package edu.lab2.pokemons;


import edu.lab2.moves.special.MagicalLeaf;
import ru.ifmo.se.pokemon.Type;

public class Leafeon extends Eevee{
    public Leafeon(String name, int level) {
        super(name, level);
        this.setStats(65, 110, 130, 60, 65, 95);
        this.setType(Type.GRASS);
        this.addMove(new MagicalLeaf());
    }
}
