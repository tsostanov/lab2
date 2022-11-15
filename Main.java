package edu.lab2;

import edu.lab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main{
    public static void main(String[] args){
        Battle b = new Battle();
        b.addAlly(new Eevee("Милашка", 1000));
        b.addAlly(new Nidoqueen("Селедка", 1000));
        b.addAlly(new NidoranF("Щлани", 1000));

        b.addFoe(new Heatran("Кто это?", 1000));
        b.addFoe(new Leafeon("Милашка из леса", 1000));
        b.addFoe(new Nidorina("Бонси", 1000));

        b.go();
    }

}
