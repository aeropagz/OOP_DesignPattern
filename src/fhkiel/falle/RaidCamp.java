package fhkiel.falle;

import fhkiel.falle.observer.ReasonEmpty;
import fhkiel.falle.observer.ReasonFull;
import fhkiel.falle.observer.Sender;
import fhkiel.falle.visitor.Trap;
import fhkiel.monster.Orc;
import fhkiel.monster.Scavenger;
import fhkiel.monster.Wolf;

public class RaidCamp extends Sender implements Trap {

    private static RaidCamp INSTANCE = null;
    private int soldiers;

    private RaidCamp() {
        this.soldiers = 25;
    }

    public static RaidCamp getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new RaidCamp();
        }
        return INSTANCE;
    }

    @Override
    public void visit(Scavenger monster) {
        if (soldiers > 0) {
            this.soldiers--;
            monster.setLifepoints(0);
            this.notifyObservers(ReasonFull.getInstance());
        } else {
            this.notifyObservers(ReasonEmpty.getInstance());
        }
    }

    @Override
    public void visit(Orc monster) {
        if (soldiers > 0) {
            this.soldiers--;
            monster.setLifepoints(monster.getLifepoints() - 50);
            this.notifyObservers(ReasonFull.getInstance());
        } else {
            this.notifyObservers(ReasonEmpty.getInstance());
        }
    }

    @Override
    public void visit(Wolf monster) {
        if (soldiers > 0) {
            this.soldiers--;
            monster.setLifepoints(monster.getLifepoints() - 100);
            this.notifyObservers(ReasonFull.getInstance());
        } else {
            this.notifyObservers(ReasonEmpty.getInstance());
        }
    }
}
