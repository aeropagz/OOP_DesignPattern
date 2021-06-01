package fhkiel.falle.observer;

public interface Observable {
    void registerObserver(final Observer observer);

    void notifyObservers(final Reason reason);

    void unregisterObserver(final Observer observer);
}
