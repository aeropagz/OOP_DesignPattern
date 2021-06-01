package fhkiel.falle;

import fhkiel.falle.observer.ReasonEmpty;
import fhkiel.falle.observer.ReasonFull;
import fhkiel.falle.observer.Sender;
import fhkiel.falle.visitor.Trap;
import fhkiel.monster.Orc;
import fhkiel.monster.Scavenger;
import fhkiel.monster.Wolf;

public class Watchtower extends Sender implements Trap {

    private static Watchtower INSTANCE = null;

    private int soldiers;

    private Watchtower() {
        this.soldiers = 5;
    }

    public static Watchtower getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Watchtower();
        }
        return INSTANCE;
    }

    @Override
    public void visit(Scavenger monster) {
        if (soldiers > 0) {
            this.soldiers--;
            monster.setLifepoints(monster.getLifepoints() - 20);
            this.notifyObservers(ReasonFull.getInstance());
        } else {
            this.notifyObservers(ReasonEmpty.getInstance());
        }
    }

    @Override
    public void visit(Orc monster) {
        if (soldiers > 0) {
            this.soldiers--;
            monster.setLifepoints(monster.getLifepoints() - 5);
            this.notifyObservers(ReasonFull.getInstance());
        } else {
            this.notifyObservers(ReasonEmpty.getInstance());
        }
    }

    @Override
    public void visit(Wolf monster) {
        if (soldiers > 0) {
            this.soldiers--;
            monster.setLifepoints(monster.getLifepoints() - 10);
            this.notifyObservers(ReasonFull.getInstance());
        } else {
            this.notifyObservers(ReasonEmpty.getInstance());
        }
    }
}
