package edu.lab2.pokemons;

import edu.lab2.moves.special.IceBeam;
import edu.lab2.moves.special.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class NidoranF extends Pokemon {
    public NidoranF(String name, int level) {
        super(name, level);
        this.setStats(55, 47, 52, 40, 40, 41);
        this.setType(Type.POISON);
        this.setMove(new SludgeBomb(), new IceBeam());
    }
}
