package fhkiel.falle.visitor;

import fhkiel.monster.Monster;
import fhkiel.monster.Orc;
import fhkiel.monster.Scavenger;
import fhkiel.monster.Wolf;

public interface Trap {
    public void visit(final Scavenger monster);
    public void visit(final Orc monster);
    public void visit(final Wolf monster);
}
