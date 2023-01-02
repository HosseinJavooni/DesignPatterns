package statePattern.states;

public class Ebotton implements State {
    @Override
    public void pressButton() {
        System.out.println("press E button");
    }

    @Override
    public void releaseButton() {
        System.out.println("release E button");
    }
}
