package statePattern.states;

public class Gbutton implements State {
    @Override
    public void pressButton() {
        System.out.println("press G button");
    }

    @Override
    public void releaseButton() {
        System.out.println("release G button");
    }
}
