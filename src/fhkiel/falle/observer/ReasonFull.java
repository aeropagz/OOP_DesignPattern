package fhkiel.falle.observer;

public class ReasonFull extends Reason {
    private static ReasonFull INSTANCE = null;

    private ReasonFull() {
    }

    public static ReasonFull getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ReasonFull();
        }

        return INSTANCE;
    }


    public void delegateBy(final ReasonDelegator reasonDelegator, final Observable sender) {
        reasonDelegator.delegate2(this, sender);
    }
}
