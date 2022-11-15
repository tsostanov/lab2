package edu.lab2.moves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Growl extends StatusMove {
    public Growl(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "использовал Growl";
    }
}
