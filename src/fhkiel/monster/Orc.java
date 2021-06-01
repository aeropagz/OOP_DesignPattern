package fhkiel.monster;

import fhkiel.falle.observer.*;
import fhkiel.falle.visitor.Trap;

public class Orc extends Monster implements Observer {

    public Orc(int lifepoints, int mana, int attackpoints) {
        super(lifepoints, mana, attackpoints);
    }

    @Override
    public void accept(Trap visitor) {
        visitor.visit(this);
    }

    @Override
    public void notify(Observable sender, Reason reason) {

    }

    @Override
    public void delegate2(Reason reason, Observable sender) {

    }

    @Override
    public void delegate2(ReasonFull reason, Observable sender) {

    }

    @Override
    public void delegate2(ReasonEmpty reason, Observable sender) {

    }
}
