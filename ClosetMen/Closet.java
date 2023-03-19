package ClosetMen;

public class Closet {
    public StateCloset stateFullEmpty;
    public StateCloset stateOpenClose;

    public Closet(StateCloset stateFullEmpty, StateCloset stateOpenClose) {
        this.stateFullEmpty = stateFullEmpty;
        this.stateOpenClose = stateOpenClose;
    }

    @Override
    public String toString() {
        return String.format("<%s %s>", stateFullEmpty, stateOpenClose);
    }
}
