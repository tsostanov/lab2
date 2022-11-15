package edu.lab2.moves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL, 0,0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "Использует Confide";
    }
}
