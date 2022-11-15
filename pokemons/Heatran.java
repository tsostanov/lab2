package edu.lab2.pokemons;

import edu.lab2.moves.special.Overheat;
import edu.lab2.moves.status.Confide;
import edu.lab2.moves.status.ScaryFace;
import edu.lab2.moves.status.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Heatran extends Pokemon {
    public Heatran(String name, int level){
        super(name, level);
        this.setStats(91, 90, 106, 130, 106, 77);
        this.setType(Type.FIRE, Type.STEEL);
        this.setMove(new Confide(), new Overheat(), new WillOWisp(), new ScaryFace());
    }
}
