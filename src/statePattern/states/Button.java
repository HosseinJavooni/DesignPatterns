package statePattern.states;

public class Button implements State{
    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    @Override
    public void pressButton() {
        state.pressButton();
    }

    @Override
    public void releaseButton() {
        state.releaseButton();
    }
}
