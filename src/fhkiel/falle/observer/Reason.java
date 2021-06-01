package fhkiel.falle.observer;

public class Reason {
    public void delegateBy(final ReasonDelegator reasonDelegator, final Observable sender) {
        reasonDelegator.delegate2(this, sender);
    }
}
