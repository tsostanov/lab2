package edu.lab2.moves.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.paralyze;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            paralyze(p);
        }
    }
    @Override
    protected String describe() {
        return "Использует Thunder";
    }
}
