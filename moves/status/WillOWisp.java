package edu.lab2.moves.status;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Effect.burn;

public class WillOWisp extends SpecialMove {
    public WillOWisp(){
        super(Type.FIRE, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        burn(p);
        p.setMod(Stat.ATTACK, -2);
    }
    @Override
    protected String describe(){
        return "Использует Will-O-Wisp";
    }
}
