package statePattern.states;

public class FButton implements State {
    @Override
    public void pressButton() {
        System.out.println("press F button");
    }

    @Override
    public void releaseButton() {
        System.out.println("release F button");
    }
}
