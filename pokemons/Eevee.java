package edu.lab2.pokemons;

import edu.lab2.moves.physical.Facade;
import edu.lab2.moves.status.TailWhip;
import edu.lab2.moves.status.WorkUp;
import ru.ifmo.se.pokemon.*;

public class Eevee extends Pokemon {

    public Eevee(String name, int level){
        super(name, level);
        this.setStats(55, 55, 50, 45, 65, 55);
        this.setType(Type.NORMAL);
        this.setMove(new Facade(), new TailWhip(), new WorkUp());

    }
}
