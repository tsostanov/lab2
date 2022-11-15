package edu.lab2.moves.status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class TailWhip extends StatusMove {
    public TailWhip(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, -1);
    }
    @Override
    protected String describe(){
        return "Использует Tail Whip";
    }
}
