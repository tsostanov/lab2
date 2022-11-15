package edu.lab2.pokemons;

import edu.lab2.moves.status.Growl;

public class Nidorina extends NidoranF{
    public Nidorina(String name, int level) {
        super(name, level);
        this.setStats(70, 62, 67, 55, 55, 56);
        this.addMove(new Growl());
    }
}
