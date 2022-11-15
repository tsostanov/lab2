package edu.lab2.moves.physical;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    protected void applyOppDamage(Pokemon def, double damage){
        Status def_stat = def.getCondition();
        if (def_stat.equals(Status.BURN) || def_stat.equals(Status.POISON) || def_stat.equals(Status.PARALYZE)) {
            super.applyOppDamage(def, damage*2);
        }
        else {
            super.applyOppDamage(def, damage);
        }
    }

    @Override
    protected String describe() {
        return "Использует Facade";
    }

}
