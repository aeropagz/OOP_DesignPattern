package fhkiel.falle.observer;

public interface Observer {
    void notify(final Observable sender, final Reason reason);
}
