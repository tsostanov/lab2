package edu.lab2.moves.special;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class MagicalLeaf extends SpecialMove {
    public MagicalLeaf(){
        super(Type.GRASS, 60, 0);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
    @Override
    protected String describe() {
        return "Использует Magical Leaf";
    }
}
