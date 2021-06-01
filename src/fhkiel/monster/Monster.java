package fhkiel.monster;

import fhkiel.falle.observer.Observer;
import fhkiel.falle.observer.ReasonDelegator;
import fhkiel.falle.visitor.Trap;

public abstract class Monster implements Observer, ReasonDelegator {

    private int lifepoints;
    private int mana;
    private int attackpoints;

    public Monster(int lifepoints, int mana, int attackpoints) {
        this.lifepoints = lifepoints;
        this.mana = mana;
        this.attackpoints = attackpoints;
    }

    public abstract void accept(final Trap visitor);

    public int getLifepoints() {
        return lifepoints;
    }

    public void setLifepoints(int lifepoints) {
        this.lifepoints = lifepoints;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getAttackpoints() {
        return attackpoints;
    }

    public void setAttackpoints(int attackpoints) {
        this.attackpoints = attackpoints;
    }
}
