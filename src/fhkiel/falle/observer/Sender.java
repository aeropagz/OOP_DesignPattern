package fhkiel.falle.observer;

public class Sender implements Observable {
    private final Observer[] myObservers = new Observer[10];

    public Sender() {

    }

    private Observer[] getMyObservers() {
        return this.myObservers;
    }

    private Observer at(final int index) {
        return this.getMyObservers()[index];
    }

    private void at(final int index, final Observer observer) {
        this.getMyObservers()[index] = observer;
    }

    private int observerSize() {
        return this.getMyObservers().length;
    }

    @Override
    public void registerObserver(Observer observer) {
        for (int i = 0; i < this.observerSize(); i++) {
            if (this.at(i) == null) {
                this.at(i, observer);
                break;
            }
        }
    }

    @Override
    public void notifyObservers(Reason reason) {
        for (Observer observer : this.getMyObservers()) {
            if(observer != null) {
                observer.notify(this, reason);
            }
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
    }
}
