package edu.lab2.moves.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import static ru.ifmo.se.pokemon.Effect.poison;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(){
        super(Type.POISON, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            poison(p);
        }
    }
    @Override
    protected String describe() {
        return "Использует SludgeBomb";
    }
}
