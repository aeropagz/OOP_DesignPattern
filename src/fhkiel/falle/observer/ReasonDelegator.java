package fhkiel.falle.observer;

public interface ReasonDelegator {
    public void delegate2(final Reason reason, final Observable sender);
    public void delegate2(final ReasonFull reason, final Observable sender);
    public void delegate2(final ReasonEmpty reason, final Observable sender);
}
