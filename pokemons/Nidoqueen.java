package edu.lab2.pokemons;

import edu.lab2.moves.special.Thunder;
import ru.ifmo.se.pokemon.Type;

public class Nidoqueen extends Nidorina{
    public Nidoqueen(String name, int level){
        super(name, level);
        this.setStats(90, 92, 87, 75, 85, 76);
        this.addType(Type.GROUND);
        this.addMove(new Thunder());
    }
}
