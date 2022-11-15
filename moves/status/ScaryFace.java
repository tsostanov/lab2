package edu.lab2.moves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.burn;

public class ScaryFace extends StatusMove {
    public ScaryFace(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -2);
    }
    @Override
    protected String describe() {
        return "Использует Scary Face";
    }
}
