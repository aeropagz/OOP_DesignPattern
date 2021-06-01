package fhkiel.falle.observer;

public class ReasonEmpty extends Reason {
    private static ReasonEmpty INSTANCE = null;

    private ReasonEmpty() {
    }

    public static ReasonEmpty getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ReasonEmpty();
        }
        return INSTANCE;
    }

    public void delegateBy(final  ReasonDelegator reasonDelegator, final Observable sender){
        reasonDelegator.delegate2(this, sender);
    }
}
